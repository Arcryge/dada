/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 下午10:42:28
 */
package com.dada.service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbItemParam;

public interface ItemParamService {

	DadaResult getItemParamByCid(long cid);

	DadaResult insertItemParam(TbItemParam itemParam);

	EUDataGridResult getItemParamList(int page, int rows);

	DadaResult deleteItemParam(long itemParamId);
}
