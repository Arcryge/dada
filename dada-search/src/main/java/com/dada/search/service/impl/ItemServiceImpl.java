/**
 * @author Arcry
 * @date 2019年5月25日
 * @time 下午3:48:51
 */
package com.dada.search.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.ExceptionUtil;
import com.dada.search.mapper.ItemMapper;
import com.dada.search.pojo.Item;
import com.dada.search.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Autowired
	private SolrServer solrServer;

	@Override
	public DadaResult importAllItems() {
		try {
			//查询商品列表
			List<Item> list = itemMapper.getItemList();
			//把商品信息写入索引库
			for (Item item : list) {
				//创建一个SolrInputDocument对象
				SolrInputDocument document = new SolrInputDocument();
				document.setField("id", item.getId());
				document.setField("item_title", item.getTitle());
				document.setField("item_sell_point", item.getSell_point());
				document.setField("item_price", item.getPrice());
				document.setField("item_image", item.getImage());
				document.setField("item_category_name", item.getCategory_name());
				document.setField("item_desc", item.getItem_des());
				//写入索引库
				solrServer.add(document);
			}
			//提交修改
			solrServer.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return DadaResult.ok();
	}

}

