/**
 * @author Arcry
 * @date 2019年5月24日
 * @time 上午11:32:20
 */
package com.dada.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.ExceptionUtil;
import com.dada.rest.dao.JedisClient;
import com.dada.rest.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private JedisClient jedisClient;

	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;

	@Override
	public DadaResult syncContent(long contentCid) {
		try {
			jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return DadaResult.ok();
	}



}
