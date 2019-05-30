/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 上午11:27:10
 */
package com.dada.service;

import java.util.List;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUTreeNode;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);

	DadaResult insertContentCategory(long parentId, String name);

	DadaResult updateContentCategory(Long id, String name);

	DadaResult deleteContentCategory(Long id);
}
