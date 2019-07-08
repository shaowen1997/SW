package com.sw.entity;

import java.util.Date;

public class Payinfo {
	private int id;//
	private int userId;//用户ID
	private long orderId;//订单号
	private int payPlatform;//支付平台:1-支付宝，2-微信
	private String platformNumber;//支付宝支付流水号
	private String platformStatus;//支付宝支付状态
	private Date createtime;//创建时间
	private Date updetetime;//最后一次更新时间

	@Override
	public String toString() {
		return "Payinfo [id=" + id + ", userId=" + userId + ", orderId=" + orderId + ", payPlatform=" + payPlatform
				+ ", platformNumber=" + platformNumber + ", platformStatus=" + platformStatus + ", createtime="
				+ createtime + ", updetetime=" + updetetime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getPayPlatform() {
		return payPlatform;
	}

	public void setPayPlatform(int payPlatform) {
		this.payPlatform = payPlatform;
	}

	public String getPlatformNumber() {
		return platformNumber;
	}

	public void setPlatformNumber(String platformNumber) {
		this.platformNumber = platformNumber;
	}

	public String getPlatformStatus() {
		return platformStatus;
	}

	public void setPlatformStatus(String platformStatus) {
		this.platformStatus = platformStatus;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdetetime() {
		return updetetime;
	}

	public void setUpdetetime(Date updetetime) {
		this.updetetime = updetetime;
	}

}
