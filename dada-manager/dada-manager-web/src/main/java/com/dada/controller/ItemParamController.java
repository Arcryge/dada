/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 下午10:52:27
 */
package com.dada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbItemParam;
import com.dada.service.ItemParamService;

/**
 * 商品规格参数模板管理Controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月18日 下午10:52:32
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	@Autowired
	private ItemParamService itemParamService;

	@RequestMapping("/query/itemcatid/{itemCatId}")
	@ResponseBody
	public DadaResult getItemParamByCid(@PathVariable Long itemCatId) {
		DadaResult result = itemParamService.getItemParamByCid(itemCatId);
		return result;
	}


	@RequestMapping("/save/{cid}")
	@ResponseBody
	public DadaResult insertItemParam(@PathVariable Long cid, String paramData) {
		//创建pojo对象
		TbItemParam itemParam = new TbItemParam();
		itemParam.setItemCatId(cid);
		itemParam.setParamData(paramData);
		DadaResult result = itemParamService.insertItemParam(itemParam);
		return result;
	}

	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getItemParamList(Integer page, Integer rows) {
		EUDataGridResult result = itemParamService.getItemParamList(page, rows);
		return result;
	}

	@RequestMapping("/delete/{itemParamId}")
	@ResponseBody
	public DadaResult deleteItem(@PathVariable Long itemParamId) {
		DadaResult result = itemParamService.deleteItemParam(itemParamId);
		return result;
	}

}
