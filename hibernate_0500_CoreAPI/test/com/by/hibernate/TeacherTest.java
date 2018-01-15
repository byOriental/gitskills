package com.by.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @Title:TeacherTest
 * @Description:这是一个测试类
 * @author:Administrator
 * @date:2018年1月2日 下午11:40:19
 */
public class TeacherTest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		sf = new MetadataSources(serviceRegistry).buildMetadata()
				.buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		// 联合主键
		// TeacherPK pk = new TeacherPK();
		// pk.setId(1);
		// pk.setName("cmp_tc_id");
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("city");
		t.setAge(2018);
		t.setAddress("beijing");

		// t.setPk(pk);

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
