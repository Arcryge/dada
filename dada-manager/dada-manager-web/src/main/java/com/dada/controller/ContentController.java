/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午2:52:52
 */
package com.dada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbContent;
import com.dada.service.ContentService;

/**
 * 内容管理Controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 下午2:52:58
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/{contentId}")
	@ResponseBody
	public TbContent getContentById(@PathVariable Long contentId) {
		TbContent tbContent = contentService.getContentById(contentId);
		return tbContent;
	}

	@RequestMapping("/query/list")
	@ResponseBody
	public EUDataGridResult getContentList(Long categoryId, Integer page, Integer rows) {
		EUDataGridResult result = contentService.getContentList(categoryId, page, rows);
		return result;
	}

	@RequestMapping("/save")
	@ResponseBody
	public DadaResult insertContent(TbContent content) {
		DadaResult result = contentService.insertContent(content);
		return result;
	}

	@RequestMapping("/edit")
	@ResponseBody
	public DadaResult updateContent(TbContent content) {
		DadaResult result = contentService.updateContent(content);
		return result;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public DadaResult deleteContent(String ids) {
		DadaResult result = contentService.deleteContent(ids);
		return result;
	}

	@RequestMapping("/getContent")
	@ResponseBody
	public DadaResult getContent(Long id) {
		DadaResult result = contentService.getContent(id);
		return result;
	}
}
