/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午6:09:59
 */
package com.dada.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.mapper.TbItemMapper;
import com.dada.pojo.TbItem;
import com.dada.rest.service.ItemService;

/**
 * 商品信息管理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午6:10:10
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public DadaResult getItemBaseInfo(long itemId) {
		//根据商品id查询商品信息
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		//使用DadaResult包装一下

		return DadaResult.ok(item);
	}

}

