package com.by.hibernate;

/**
 * 
 * @Title:Student
 * @Description:联合主键
 * @author:Administrator
 * @date:2018年1月3日 下午8:28:17
 */
public class Student {
	private int id;
	private String name;
	private int age;

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

	// private String id;//使用uuid时，字段类型必须为String

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
