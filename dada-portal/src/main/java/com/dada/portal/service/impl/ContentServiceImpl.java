/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午8:08:47
 */
package com.dada.portal.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.common.utils.JsonUtils;
import com.dada.pojo.TbContent;
import com.dada.portal.service.ContentService;

/**
 * 调用服务层，查询内容列表
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 下午8:08:56
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_INDEX_AD_URL}")
	private String REST_INDEX_AD_URL;

	@Override
	public String getContentList() {
		//调用服务层的服务
		String result = HttpClientUtil.doGet(REST_BASE_URL + REST_INDEX_AD_URL);
		//把字符串转换成DadaResult
		try {
			DadaResult dadaResult = DadaResult.formatToList(result, TbContent.class);
			//取内容列表
			List<TbContent> list = (List<TbContent>) dadaResult.getData();
			List<Map> resultList = new ArrayList<>();
			//创建一个jsp页码要求的pojo列表
			for (TbContent tbContent : list) {
				Map map = new HashMap<>();
				map.put("src", tbContent.getPic());
				map.put("height", 240);
				map.put("width", 670);
				map.put("srcB", tbContent.getPic2());
				map.put("widthB", 550);
				map.put("heightB", 240);
				map.put("href", tbContent.getUrl());
				map.put("alt", tbContent.getSubTitle());
				resultList.add(map);
			}
			return JsonUtils.objectToJson(resultList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
