/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 下午2:42:20
 */
package com.dada.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dada.common.pojo.DadaResult;
import com.dada.portal.service.CartService;

/**
 * 购物车controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月28日 下午2:42:26
 */
@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping("/add/{itemId}")
	public String addCartItem(@PathVariable Long itemId, @RequestParam(defaultValue = "1") Integer num,
			HttpServletRequest request, HttpServletResponse response) {
		DadaResult result = cartService.addCartItem(itemId, num, request, response);
		return "cartSuccess";
	}

}

