/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 上午10:42:44
 */
package com.dada.portal.service;

import com.dada.pojo.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}
