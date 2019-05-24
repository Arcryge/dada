/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午4:07:46
 */
package com.dada.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.ExceptionUtil;
import com.dada.pojo.TbContent;
import com.dada.rest.service.ContentService;

/**
 * 内容管理controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 下午4:08:00
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/list/{contentCategoryId}")
	@ResponseBody
	public DadaResult getContentList(@PathVariable Long contentCategoryId) {
		try {
			List<TbContent> list = contentService.getContentList(contentCategoryId);
			return DadaResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
