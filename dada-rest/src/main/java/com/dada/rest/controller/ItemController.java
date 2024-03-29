/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午6:13:49
 */
package com.dada.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.rest.service.ItemService;

/**
 * 商品信息controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午6:14:02
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public DadaResult getItemBaseInfo(@PathVariable Long itemId) {
		DadaResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}

	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public DadaResult getItemDesc(@PathVariable Long itemId) {
		DadaResult result = itemService.getItemDesc(itemId);
		return result;
	}

	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public DadaResult getItemParam(@PathVariable Long itemId) {
		DadaResult result = itemService.getItemParam(itemId);
		return result;
	}

}
