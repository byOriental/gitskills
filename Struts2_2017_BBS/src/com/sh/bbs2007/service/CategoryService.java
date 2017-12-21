package com.sh.bbs2007.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sh.bbs2017.model.Category;
import com.sh.bbs2017.util.DB;

public class CategoryService {
	// 添加
	public void add(Category c) {
		Connection conn = DB.createConn();
		String sql = "insert into _category values (null,?,?)";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, c.getName());
			ps.setString(2, c.getDescription());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);

	}

	// 删除-通过对象
	public void delete(Category c) {
		deleteById(c.getId());
	}

	// 删除-通过id
	public void deleteById(int id) {
		Connection conn = DB.createConn();
		String sql = "delete from _category where id = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}

	// 更新-通过对象
	public void update(Category c) {
		Connection conn = null;
		conn = DB.createConn();
		String sql = "update from _category set name=?,description=? where id=?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, c.getName());
			ps.setString(2, c.getDescription());
			ps.setInt(3, c.getId());
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}

	// 更新-通过id
	public Category updateById(int id) {
		Connection conn = null;
		conn = DB.createConn();
		String sql = "update from _category where id=?";
		PreparedStatement ps = DB.prepare(conn, sql);
		ResultSet rs = null;
		Category c = null;
		try {
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				c = new Category();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(conn);
		DB.close(ps);
		return c;
	}

	// 查询
	public List<Category> list() {
		Connection conn = DB.createConn();
		String sql = "select * from _category";
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Category> categories = new ArrayList<Category>();
		try {
			ResultSet rs = ps.executeQuery();
			Category c = null;
			while (rs.next()) {
				// 将结果集rs里面的每一字段拿出来getxx,设置到对应的对象属性里setxx
				// ps.setInt(1, c.getId());与插入进去是相反的操作
				c = new Category();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
				categories.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		return categories;
	}

}
