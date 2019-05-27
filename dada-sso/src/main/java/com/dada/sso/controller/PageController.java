/**
 * @author Arcry
 * @date 2019年5月27日
 * @time 下午11:23:53
 */
package com.dada.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月27日 下午11:23:58
 */
@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
}
