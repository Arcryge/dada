/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午9:38:45
 */
package com.dada.portal.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.common.utils.JsonUtils;
import com.dada.pojo.TbItemDesc;
import com.dada.pojo.TbItemParamItem;
import com.dada.portal.pojo.ItemInfo;
import com.dada.portal.service.ItemService;

/**
 * 商品信息管理Service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午9:38:58
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${ITEM_INFO_URL}")
	private String ITEM_INFO_URL;
	@Value("${ITEM_DESC_URL}")
	private String ITEM_DESC_URL;
	@Value("${ITEM_PARAM_URL}")
	private String ITEM_PARAM_URL;

	@Override
	public ItemInfo getItemById(Long itemId) {
		try {
			//调用rest的服务查询商品基本信息
			String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_INFO_URL + itemId);
			if (!StringUtils.isBlank(json)) {
				DadaResult dadaResult = DadaResult.formatToPojo(json, ItemInfo.class);
				if (dadaResult.getStatus() == 200) {
					ItemInfo item = (ItemInfo) dadaResult.getData();
					return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 取商品描述
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月27日 上午12:47:10
	 */
	@Override
	public String getItemDescById(Long itemId) {
		try {
			//查询商品描述
			String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_DESC_URL + itemId);
			//转换成java对象
			DadaResult dadaResult = DadaResult.formatToPojo(json, TbItemDesc.class);
			if (dadaResult.getStatus() == 200) {
				TbItemDesc itemDesc = (TbItemDesc) dadaResult.getData();
				//取商品描述信息
				String result = itemDesc.getItemDesc();
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据商品id查询规格参数
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月27日 上午1:04:51
	 */
	@Override
	public String getItemParam(Long itemId) {
		try {
			String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_PARAM_URL + itemId);
			//把json转换成java对象
			DadaResult dadaResult = DadaResult.formatToPojo(json, TbItemParamItem.class);
			if (dadaResult.getStatus() == 200) {
				TbItemParamItem itemParamItem = (TbItemParamItem) dadaResult.getData();
				String paramData = itemParamItem.getParamData();
				//生成html
				// 把规格参数json数据转换成java对象
				List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
				StringBuffer sb = new StringBuffer();
				sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"0\" class=\"Ptable\">\n");
				sb.append("    <tbody>\n");
				for (Map m1 : jsonList) {
					sb.append("        <tr>\n");
					sb.append("            <th class=\"tdTitle\" colspan=\"2\">" + m1.get("group") + "</th>\n");
					sb.append("        </tr>\n");
					List<Map> list2 = (List<Map>) m1.get("params");
					for (Map m2 : list2) {
						sb.append("        <tr>\n");
						sb.append("            <td class=\"tdTitle\">" + m2.get("k") + "</td>\n");
						sb.append("            <td>" + m2.get("v") + "</td>\n");
						sb.append("        </tr>\n");
					}
				}
				sb.append("    </tbody>\n");
				sb.append("</table>");
				//返回html片段 
				return sb.toString();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}

}

