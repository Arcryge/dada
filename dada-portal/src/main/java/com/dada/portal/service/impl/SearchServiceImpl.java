/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午12:45:02
 */
package com.dada.portal.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.portal.pojo.SearchResult;
import com.dada.portal.service.SearchService;

/**
 * 商品搜索Service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午12:45:14
 */
@Service
public class SearchServiceImpl implements SearchService {

	@Value("${SEARCH_BASE_URL}")
	private String SEARCH_BASE_URL;

	@Override
	public SearchResult search(String queryString, int page) {
		// 调用dada-search的服务
		//查询参数
		Map<String, String> param = new HashMap<>();
		param.put("q", queryString);
		param.put("page", page + "");
		try {
			//调用服务
			String json = HttpClientUtil.doGet(SEARCH_BASE_URL, param);
			//把字符串转换成java对象
			DadaResult dadaResult = DadaResult.formatToPojo(json, SearchResult.class);
			if (dadaResult.getStatus() == 200) {
				SearchResult result = (SearchResult) dadaResult.getData();
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

