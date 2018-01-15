package com.by.hibernate;

import java.io.Serializable;

/**
 * 
 * @Title:StudentPK
 * @Description:����������������ͬ�Ķ���Ƚϣ�����ʵ��equals������hashCode����
 * @author:Administrator
 * @date:2018��1��3�� ����9:11:13
 */
public class StudentPK implements Serializable {
	private int id;
	private String name;

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

	@Override
	public boolean equals(Object o) {
		if (o instanceof StudentPK) {
			StudentPK pk = (StudentPK) o;
			if (this.id == pk.getId() && this.name.equals(pk.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}
