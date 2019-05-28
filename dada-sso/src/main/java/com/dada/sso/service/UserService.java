/**
 * @author Arcry
 * @date 2019年5月27日
 * @time 上午11:55:46
 */
package com.dada.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dada.common.pojo.DadaResult;
import com.dada.pojo.TbUser;

public interface UserService {

	DadaResult checkData(String content, Integer type);

	DadaResult createUser(TbUser user);

	DadaResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

	DadaResult getUserByToken(String token);

}
