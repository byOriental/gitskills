package com.by.hibernate;

/**
 * 
 * @Title:Student
 * @Description:��������
 * @author:Administrator
 * @date:2018��1��3�� ����8:28:17
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

	// private String id;//ʹ��uuidʱ���ֶ����ͱ���ΪString

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
