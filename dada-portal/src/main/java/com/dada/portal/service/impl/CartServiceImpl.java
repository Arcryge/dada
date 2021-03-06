/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 下午2:13:10
 */
package com.dada.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.CookieUtils;
import com.dada.common.utils.HttpClientUtil;
import com.dada.common.utils.JsonUtils;
import com.dada.pojo.TbItem;
import com.dada.portal.pojo.CartItem;
import com.dada.portal.service.CartService;

/**
 * 添加购物车商品
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月28日 下午2:13:36
 */
@Service
public class CartServiceImpl implements CartService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${ITEM_INFO_URL}")
	private String ITEM_INFO_URL;

	/**
	 * 添加购物车商品
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @param num
	 * @param request
	 * @param response
	 * @return
	 * @time 2019年5月28日 下午2:23:51
	 */
	@Override
	public DadaResult addCartItem(long itemId, int num, HttpServletRequest request, HttpServletResponse response) {
		//取商品信息
		CartItem cartItem = null;
		//取购物车商品列表
		List<CartItem> itemList = getCartItemList(request);
		//判断购物车商品列表中是否存在此商品
		for (CartItem cItem : itemList) {
			//如果存在此商品
			if (cItem.getId() == itemId) {
				//增加商品数量
				cItem.setNum(cItem.getNum() + num);
				cartItem = cItem;
				break;
			}
		}
		if (cartItem == null) {
			cartItem = new CartItem();
			//根据商品id查询商品基本信息。
			String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_INFO_URL + itemId);
			//把json转换成java对象
			DadaResult dadaResult = DadaResult.formatToPojo(json, TbItem.class);
			if (dadaResult.getStatus() == 200) {
				TbItem item = (TbItem) dadaResult.getData();
				cartItem.setId(item.getId());
				cartItem.setTitle(item.getTitle());
				cartItem.setImage(item.getImage() == null ? "" : item.getImage().split(",")[0]);
				cartItem.setNum(num);
				cartItem.setPrice(item.getPrice());
			}
			//添加到购物车列表
			itemList.add(cartItem);
		}
		//把购物车列表写入cookie
		CookieUtils.setCookie(request, response, "DD_CART", JsonUtils.objectToJson(itemList), true);

		return DadaResult.ok();
	}

	/**
	 * 从cookie中取商品列表
	 * @desc 
	 * @author Arcry
	 * @param request
	 * @return
	 * @return List<CartItem>
	 * @time 2019年5月28日 下午2:24:36
	 */
	private List<CartItem> getCartItemList(HttpServletRequest request) {
		//从cookie中取商品列表
		String cartJson = CookieUtils.getCookieValue(request, "DD_CART", true);
		if (cartJson == null) {
			return new ArrayList<>();
		}
		//把json转换成商品列表
		try {
			List<CartItem> list = JsonUtils.jsonToList(cartJson, CartItem.class);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	/**
	 * 取商品列表
	 * @desc
	 * @author Arcry
	 * @param request
	 * @param response
	 * @return
	 * @time 2019年5月29日 上午9:49:43
	 */
	@Override
	public List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response) {
		List<CartItem> itemList = getCartItemList(request);
		return itemList;
	}

	/**
	 * 删除购物车商品
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月28日 下午4:33:43
	 */
	@Override
	public DadaResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response) {
		//从cookie中取购物车商品列表
		List<CartItem> itemList = getCartItemList(request);
		//从列表中找到此商品
		for (CartItem cartItem : itemList) {
			if (cartItem.getId() == itemId) {
				itemList.remove(cartItem);
				break;
			}
		}
		//把购物车列表重新写入cookie
		CookieUtils.setCookie(request, response, "DD_CART", JsonUtils.objectToJson(itemList), true);

		return DadaResult.ok();
	}

}
