/**
 * @author Arcry
 * @date 2019年5月25日
 * @time 下午9:35:36
 */
package com.dada.search.service;

import com.dada.search.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page, int rows) throws Exception;
}
