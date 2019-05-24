/**
 * @author Arcry
 * @date 2019年4月25日
 * @time 下午9:01:49
 */
package com.dada.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dada.mapper.TbItemMapper;
import com.dada.pojo.TbItem;
import com.dada.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class TestPageHelper {

	/**
	 * 
	 * @desc 测试分页插件PageHelper
	 * @author Arcry
	 * @return void
	 * @time 2019年4月25日 下午9:02:53
	 */
	@Test
	public void testPageHelper() {
		//创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
		//从spring容器中获得Mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//执行查询，并分页
		TbItemExample example = new TbItemExample();
		//分页处理	
		PageHelper.startPage(1, 10);
		java.util.List<TbItem> list = mapper.selectByExample(example);
		//取商品列表
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		//取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("共有商品：" + total);
	}
}
