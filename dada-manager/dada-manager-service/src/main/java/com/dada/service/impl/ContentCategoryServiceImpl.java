/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 上午11:29:16
 */
package com.dada.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUTreeNode;
import com.dada.mapper.TbContentCategoryMapper;
import com.dada.pojo.TbContentCategory;
import com.dada.pojo.TbContentCategoryExample;
import com.dada.pojo.TbContentCategoryExample.Criteria;
import com.dada.service.ContentCategoryService;

/**
 * 内容分类管理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 上午11:30:12
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;

	@Override
	public List<EUTreeNode> getCategoryList(long parentId) {
		//根据parentid查询节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<EUTreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			//创建一个节点
			EUTreeNode node = new EUTreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent() ? "closed" : "open");

			resultList.add(node);
		}
		return resultList;
	}

	/**
	 * 
	 * @desc
	 * @author Arcry
	 * @param parentId
	 * @param name
	 * @return
	 * @time 2019年5月20日 下午12:27:17
	 */
	@Override
	public DadaResult insertContentCategory(long parentId, String name) {

		//创建一个pojo
		TbContentCategory contentCategory = new TbContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		//'状态。可选值:1(正常),2(删除)',
		contentCategory.setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		//添加记录
		contentCategoryMapper.insert(contentCategory);
		//查看父节点的isParent列是否为true，如果不是true改成true
		TbContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		//判断是否为true
		if (!parentCat.getIsParent()) {
			parentCat.setIsParent(true);
			//更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentCat);
		}
		//返回结果
		return DadaResult.ok(contentCategory);
	}

	@Override
	public DadaResult updateContentCategory(Long id, String name) {
		TbContentCategory tbContentCategory = contentCategoryMapper.selectByPrimaryKey(id);
        if(tbContentCategory != null){
            tbContentCategory.setName(name);
            try {
            	contentCategoryMapper.updateByPrimaryKey(tbContentCategory);
                return DadaResult.ok();
            }catch (Exception e){
                e.printStackTrace();
				this.getReturnResult(500, "后台报错：数据库操作异常!", null);
            }
        }
		return this.getReturnResult(500, "后台报错：空指针异常!", null);
	}

	@Override
	public DadaResult deleteContentCategory(Long id) {
		try {
			TbContentCategory tbContentCategory = contentCategoryMapper.selectByPrimaryKey(id);
			if (tbContentCategory != null) {
				//删除当前节点
				contentCategoryMapper.deleteByPrimaryKey(id);
				//递归删除子节点
				this.recursiveDeleteCategory(id);
				//判断父节点状态，修改父节点状态
				this.updateParentNodeStatus(tbContentCategory.getParentId());
			}
		} catch (Exception e) {
			return this.getReturnResult(500, "后台报错：数据库操作异常！", null);
		}
		return DadaResult.ok();
	}

	private void updateParentNodeStatus(Long parentId) {
		//查询父id是否还有子节点
		TbContentCategoryExample example = new TbContentCategoryExample();
		TbContentCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		if (list.size() == 0) {
			//修改父节点状态为叶子节点（因为删除此节点后，父节点再无子节点）
			TbContentCategory parent = contentCategoryMapper.selectByPrimaryKey(parentId);
			if (parent.getIsParent()) {
				parent.setIsParent(false);
				//修改父节点状态
				this.updateParentStatus(parent);
			}
		}
	}

	private void recursiveDeleteCategory(Long parentId) {
		TbContentCategoryExample example = new TbContentCategoryExample();
		TbContentCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		try {
			List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
			for (TbContentCategory contentCategory : list) {
				if (contentCategory.getIsParent()) {
					contentCategoryMapper.deleteByPrimaryKey(contentCategory.getId());
					//递归循坏
					this.recursiveDeleteCategory(contentCategory.getId());
				} else {
					//删除
					contentCategoryMapper.deleteByPrimaryKey(contentCategory.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private DadaResult getReturnResult(Integer status, String msg, Object obj) {
		DadaResult result = new DadaResult(status, msg, obj);
		return result;
	}

	private void updateParentStatus(TbContentCategory parent) {
		contentCategoryMapper.updateByPrimaryKey(parent);
	}

}
