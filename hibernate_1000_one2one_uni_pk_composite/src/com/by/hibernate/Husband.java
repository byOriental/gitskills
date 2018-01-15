package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

/**
 * 
 * @Title:Husband
 * @Description:������������
 * @author:Administrator
 * @date:2018��1��15�� ����4:56:21
 */
@Entity
public class Husband {
	private int id;
	private String name;
	private Wife wife;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// wifeIdָ����Wife
	@OneToOne
	@JoinColumns({ @JoinColumn(name = "wifeId", referencedColumnName = "id"),
			@JoinColumn(name = "wifeName", referencedColumnName = "name") })
	public Wife getWife() {
		return wife;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

}
