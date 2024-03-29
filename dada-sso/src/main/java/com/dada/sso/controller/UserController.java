/**
 * @author Arcry
 * @date 2019年5月27日
 * @time 下午12:07:45
 */
package com.dada.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.ExceptionUtil;
import com.dada.pojo.TbUser;
import com.dada.sso.service.UserService;

/**
 * 用户controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月27日 下午12:07:51
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {

		DadaResult result = null;

		//参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = DadaResult.build(400, "校验内容不能为空");
		}
		if (type == null) {
			result = DadaResult.build(400, "校验内容类型不能为空");
		}
		if (type != 1 && type != 2 && type != 3) {
			result = DadaResult.build(400, "校验内容类型错误");
		}
		//校验出错
		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}
		//调用服务
		try {
			result = userService.checkData(param, type);

		} catch (Exception e) {
			result = DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result;
		}
	}

	/**
	 * 创建用户
	 * @desc 
	 * @author Arcry
	 * @param user
	 * @return
	 * @return DadaResult
	 * @time 2019年5月27日 下午5:31:13
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public DadaResult createUser(TbUser user) {

		try {
			DadaResult result = userService.createUser(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/**
	 * 用户登录
	 * @desc 
	 * @author Arcry
	 * @param username
	 * @param password
	 * @return
	 * @return DadaResult
	 * @time 2019年5月27日 下午8:11:43
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public DadaResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			DadaResult result = userService.userLogin(username, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		DadaResult result = null;
		try {
			result = userService.getUserByToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		//判断是否为jsonp调用
		if (StringUtils.isBlank(callback)) {
			return result;
		} else {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}

	}

}
