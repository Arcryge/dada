/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 上午12:58:37
 */
package com.dada.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.mapper.TbItemCatMapper;
import com.dada.pojo.TbItemCat;
import com.dada.pojo.TbItemCatExample;
import com.dada.pojo.TbItemCatExample.Criteria;
import com.dada.rest.pojo.CatNode;
import com.dada.rest.pojo.CatResult;
import com.dada.rest.service.ItemCatService;

/**
 * 商品分类服务
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 上午12:58:44
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public CatResult getItemCatList() {

		CatResult catResult = new CatResult();
		//查询分类列表
		catResult.setData(getCatList(0));
		return catResult;
	}

	/**
	 * 查询分类列表
	 * @desc 
	 * @author Arcry
	 * @param parentId
	 * @return
	 * @return List<?>
	 * @time 2019年5月20日 上午1:03:30
	 */
	private List<?> getCatList(long parentId) {
		//创建查询条件
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		//返回值list
		List resultList = new ArrayList<>();
		//向list中添加节点
		int count = 0;
		for (TbItemCat tbItemCat : list) {
			//判断是否为父节点
			if (tbItemCat.getIsParent()) {
				CatNode catNode = new CatNode();
				if (parentId == 0) {
					catNode.setName("<a href='/products/"+tbItemCat.getId()+".html'>"+tbItemCat.getName()+"</a>");
				} else {
					catNode.setName(tbItemCat.getName());
				}
				catNode.setUrl("/products/"+tbItemCat.getId()+".html");
				catNode.setItem(getCatList(tbItemCat.getId()));
				
				resultList.add(catNode);
				count++;
				//第一层只取14条记录
				if (parentId == 0 && count >= 14) {
					break;
				}
			//如果是叶子节点
			} else {
				resultList.add("/products/"+tbItemCat.getId()+".html|" + tbItemCat.getName());
			}
		}
		return resultList;
	}
}

