/**
 * @author Arcry
 * @date 2019年4月24日
 * @time 下午11:06:57
 */
package com.dada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年4月24日 下午11:07:29
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "login";
	}

	/**
	 * 
	 * @desc 展示其他页面
	 * @author Arcry
	 * @param page
	 * @return
	 * @return String
	 * @time 2019年4月24日 下午11:17:21
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}

}
