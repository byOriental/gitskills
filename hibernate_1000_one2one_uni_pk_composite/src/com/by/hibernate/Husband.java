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
 * @Description:单向联合主键
 * @author:Administrator
 * @date:2018年1月15日 下午4:56:21
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

	// wifeId指向类Wife
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
