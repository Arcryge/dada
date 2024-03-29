/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 上午10:22:15
 */
package com.dada.portal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dada.common.utils.CookieUtils;
import com.dada.pojo.TbUser;
import com.dada.portal.service.impl.UserServiceImpl;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private UserServiceImpl userService;

	/*
	 * handle执行前的操作
	 * 返回值决定Handler是否执行。true：执行。false：不执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//判断用户是否登录
		//从cookie中取token
		String token = CookieUtils.getCookieValue(request, "DD_TOKEN");
		//根据token换取用户信息，调用sso系统的接口
		TbUser user = userService.getUserByToken(token);
		//取不到用户信息
		if (null == user) {
			//跳转到登录页面，把用户请求的url作为参数传递给登录页面。
			response.sendRedirect(
					userService.SSO_BASE_URL + userService.SSO_PAGE_LOGIN + "?redirect=" + request.getRequestURL());
			//返回false
			return false;
		}
		//取到用户信息，放行
		//把用户信息放入request
		request.setAttribute("user", user);
		//返回值决定Handler是否执行。true：执行；false：不执行。
		return true;
	}

	/*
	 * handle执行之后返回modelandview之前
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * 返回modelandview之后
	 * 响应用户之后
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
