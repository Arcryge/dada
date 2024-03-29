/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 上午1:21:46
 */
package com.dada.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.rest.pojo.CatResult;
import com.dada.rest.service.ItemCatService;

/**
 * 商品分类列表
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 上午1:22:05
 */
@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	//方法一
	//	@RequestMapping(value = "/itemcat/list", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	//	@ResponseBody
	//	public String getItemCatList(String callback) {
	//		CatResult catResult = itemCatService.getItemCatList();
	//		//把pojo转换成字符串
	//		String json = JsonUtils.objectToJson(catResult);
	//		//拼装返回值
	//		String result = callback + "(" + json + ");";
	//		return result;
	//	}

	//方法2
	@RequestMapping("/itemcat/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		CatResult catResult = itemCatService.getItemCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}

}
