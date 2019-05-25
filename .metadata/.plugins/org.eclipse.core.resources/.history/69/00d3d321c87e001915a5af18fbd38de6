/**
 * @author Arcry
 * @date 2019年5月25日
 * @time 下午4:00:23
 */
package com.dada.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.search.service.ItemService;

/**
 * 索引库维护
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月25日 下午4:00:35
 */
@Controller
@RequestMapping("/manager")
public class ItemController {

	@Autowired
	private ItemService itemService;

	/**
	 * 导入商品数据到索引库
	 */
	@RequestMapping("/importall")
	@ResponseBody
	public DadaResult importAllItems() {
		DadaResult result = itemService.importAllItems();
		return result;
	}
}
