/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午4:03:36
 */
package com.dada.rest.service;

import java.util.List;

import com.dada.pojo.TbContent;

public interface ContentService {

	List<TbContent> getContentList(long contentId);
}
