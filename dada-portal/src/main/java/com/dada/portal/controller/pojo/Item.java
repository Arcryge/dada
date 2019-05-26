/**
 * @author Arcry
 * @date 2019年5月25日
 * @time 下午3:33:54
 */
package com.dada.portal.controller.pojo;

public class Item {

	private String id;
	private String title;
	private String sell_point;
	private long price;
	private String image;
	private String category_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSell_point() {
		return sell_point;
	}

	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getItem_des() {
		return item_des;
	}

	public void setItem_des(String item_des) {
		this.item_des = item_des;
	}
	private String item_des;
}