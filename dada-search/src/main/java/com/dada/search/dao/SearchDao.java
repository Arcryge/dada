/**
 * @author Arcry
 * @date 2019年5月25日
 * @time 下午9:24:11
 */
package com.dada.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.dada.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
