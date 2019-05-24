/**
 * @author Arcry
 * @date 2019年5月2日
 * @time 下午2:22:40
 */
package com.dada.service;

import java.util.List;

import com.dada.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
