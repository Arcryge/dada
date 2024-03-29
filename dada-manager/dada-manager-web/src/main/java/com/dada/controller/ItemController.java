/**
 * @author Arcry
 * @date 2019年4月24日
 * @time 下午7:59:33
 */
package com.dada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbItem;
import com.dada.service.ItemService;

/**
 * 商品管理Controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年4月24日 下午7:59:58
 */
@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	//@Autowired
	//private ItemDescService itemDescService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}

	@RequestMapping(value = "item/save", method = RequestMethod.POST)
	@ResponseBody
	private DadaResult createItem(TbItem item, String desc, String itemParams) throws Exception {
		DadaResult result = itemService.createItem(item, desc, itemParams);
		return result;
	}

	@RequestMapping("/item/query/item/desc/{itemId}")
	@ResponseBody
	public DadaResult getItemDesc(@PathVariable Long itemId) {
		DadaResult result = itemService.getItemDesc(itemId);
		return result;
	}

	@RequestMapping("/item/query/item/param/{itemId}")
	@ResponseBody
	public DadaResult getItemParam(@PathVariable Long itemId) {
		DadaResult result = itemService.getItemParam(itemId);
		return result;
	}

	@RequestMapping(value = "/item/update/{itemId}", method = RequestMethod.POST)
	@ResponseBody
	private DadaResult updateItem(@PathVariable Long itemId, TbItem item, String desc, String itemParams)
			throws Exception {
		DadaResult result = itemService.updateItem(itemId, item, desc, itemParams);
		return result;
	}

	@RequestMapping("/item/delete/{itemId}")
	@ResponseBody
	public DadaResult deleteItem(@PathVariable Long itemId) {
		DadaResult result = itemService.deleteItem(itemId);
		return result;
	}

	@RequestMapping("/rest/item/{method}")
	@ResponseBody
	public DadaResult updateItemStatus(@RequestParam(value = "ids") List<Long> ids, @PathVariable String method) {
		DadaResult result = itemService.updateItemStatus(ids, method);
		return result;
	}

}


