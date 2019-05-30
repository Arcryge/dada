/**
 * @author Arcry
 * @date 2019年4月23日
 * @time 下午9:18:51
 */
package com.dada.service;

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

	DadaResult deleteItem(long itemId);

}
