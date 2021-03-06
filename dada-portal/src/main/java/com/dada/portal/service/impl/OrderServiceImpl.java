/**
 * @author Arcry
 * @date 2019年5月29日
 * @time 上午10:12:38
 */
package com.dada.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.common.utils.JsonUtils;
import com.dada.portal.pojo.Order;
import com.dada.portal.service.OrderService;

/**
 * 订单处理service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月29日 上午10:12:42
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER_CREATE_URL}")
	private String ORDER_CREATE_URL;

	@Override
	public String createOrder(Order order) {
		//调用创建订单服务之前补全用户信息
		//从cookie中取DD_TOKEN的内容，根据token调用sso系统的服务根据token换取用户信息。  
		//调用dada-order的服务提交订单。
		String json = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER_CREATE_URL, JsonUtils.objectToJson(order));
		//把json转换成dadaResult
		DadaResult dadaResult = DadaResult.format(json);
		if (dadaResult.getStatus() == 200) {
			Object orderId = dadaResult.getData();
			return orderId.toString();
		}
		return "";
	}

}

