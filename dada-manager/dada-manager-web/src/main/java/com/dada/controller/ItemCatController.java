/**
 * 	商品分类管理controller
 * @author Arcry
 * @date 2019年5月2日
 * @time 下午2:53:22
 */
package com.dada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.EUTreeNode;
import com.dada.service.ItemCatService;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping("/list")
	@ResponseBody
	//如果id为null是使用默认值，也就是parentid为0的分类列表
	public List<EUTreeNode> getCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) throws Exception {
		List<EUTreeNode> list = itemCatService.getCatList(parentId);
		return list;

	}

}

