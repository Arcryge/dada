/**
 * @author Arcry
 * @date 2019年5月29日
 * @time 上午8:53:58
 */
package com.dada.order.pojo;

import java.util.List;

import com.dada.pojo.TbOrder;
import com.dada.pojo.TbOrderItem;
import com.dada.pojo.TbOrderShipping;

public class Order extends TbOrder {

	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;

	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}

	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}

}
