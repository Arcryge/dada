/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 下午11:56:24
 */
package com.dada.order.service;

import java.util.List;

import com.dada.common.pojo.DadaResult;
import com.dada.pojo.TbOrder;
import com.dada.pojo.TbOrderItem;
import com.dada.pojo.TbOrderShipping;

public interface OrderService {

	DadaResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
