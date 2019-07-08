package com.sw.entity;

import java.util.Date;

import javax.xml.crypto.Data;

public class User {
	private int id;           //用户表ID
	private String username;  //用户名
	private String password;  // 密码
	private String email;     //邮箱
	private String phone;     //电话
	private String question;  //找回密码问题
	private String answer;    //找回密码问题
	private int role;         //角色 0-管理员，1-普通用户
	private Date createtime;  //创建时间
	private Date updatetime;  //最后一次更新时间
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone="
				+ phone + ", question=" + question + ", answer=" + answer + ", role=" + role + ", createtime="
				+ createtime + ", updatetime=" + updatetime + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
