/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午9:37:53
 */
package com.dada.portal.service;

import com.dada.portal.pojo.ItemInfo;

public interface ItemService {

	ItemInfo getItemById(Long itemId);

	String getItemDescById(Long itemId);

	String getItemParam(Long itemId);

}
