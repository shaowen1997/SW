package com.sw.entity;

import java.util.Date;

public class Product {
	private int id;//商品表id
	private String name;//商品名称
	private String subtitle;//商品副标题
	private String mainImage;//产品主图 URL相对地址
	private String subImage;//图片地址，josn格式，扩展用
	private String datail;//商品详情
	private double price;//价格
	private int stock;//库存数量
	private int status;//商品状态，1-在售，2-下架， 3-删除
	private Date createtime;//创建时间
	private Date updatatime;//最后一次更新时间

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subtitle=" + subtitle + ", mainImage=" + mainImage
				+ ", subImage=" + subImage + ", datail=" + datail + ", price=" + price + ", stock=" + stock
				+ ", status=" + status + ", createtime=" + createtime + ", updatatime=" + updatatime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getSubImage() {
		return subImage;
	}

	public void setSubImage(String subImage) {
		this.subImage = subImage;
	}

	public String getDatail() {
		return datail;
	}

	public void setDatail(String datail) {
		this.datail = datail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatatime() {
		return updatatime;
	}

	public void setUpdatatime(Date updatatime) {
		this.updatatime = updatatime;
	}

}
