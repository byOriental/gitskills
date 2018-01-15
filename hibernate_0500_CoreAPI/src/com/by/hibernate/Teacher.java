package com.by.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
	// private TeacherPK pk;
	private int id;
	private String name;
	private int age;
	private String address;

	@Id
	@GeneratedValue
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

	// @EmbeddedId
	// public TeacherPK getPk() {
	// return pk;
	// }
	//
	// public void setPk(TeacherPK pk) {
	// this.pk = pk;
	// }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(updatable = false)
	// 不想更新address字段
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
