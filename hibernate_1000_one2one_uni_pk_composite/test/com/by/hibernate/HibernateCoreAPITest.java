package com.by.hibernate;

import java.util.EnumSet;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @Title:HibernateCoreAPITest
 * @Description:���������
 * @author:Administrator
 * @date:2018��1��4�� ����11:17:34
 */
public class HibernateCoreAPITest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

	@Test
	public void testSchemaExport() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

}
