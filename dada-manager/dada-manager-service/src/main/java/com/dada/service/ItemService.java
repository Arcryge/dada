/**
 * @author Arcry
 * @date 2019年4月23日
 * @time 下午9:18:51
 */
package com.dada.service;

import java.util.List;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);

	EUDataGridResult getItemList(int page, int rows);

	DadaResult createItem(TbItem item, String desc, String itemParam) throws Exception;

	DadaResult getItemDesc(long itemId);

	DadaResult getItemParam(long itemId);

	DadaResult updateItem(long itemId, TbItem item, String desc, String itemParams) throws Exception;

	/**
	 * 更新商品状态
	 * @desc 
	 * @author Arcry
	 * @param ids
	 * @param method
	 * @return
	 * @return DadaResult
	 * @time 2019年5月31日 下午8:48:04
	 */
	DadaResult updateItemStatus(List<Long> ids, String method);

	DadaResult deleteItem(long itemId);

}
