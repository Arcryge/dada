/**
 * @author Arcry
 * @date 2019年5月19日
 * @time 下午5:15:41
 */
package com.dada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dada.service.ItemParamItemService;

/**
 * 展示商品规格参数
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月19日 下午5:15:47
 */
@Controller
public class ItemParamItemController {

	@Autowired
	private ItemParamItemService itemParamItemService;

	@RequestMapping("/showitem/{itemId}")
	public String showItemParam(@PathVariable Long itemId, Model model) {
		String s = itemParamItemService.getItemParamByItemId(itemId);
		model.addAttribute("itemParam", s);
		return "item";
	}

}
