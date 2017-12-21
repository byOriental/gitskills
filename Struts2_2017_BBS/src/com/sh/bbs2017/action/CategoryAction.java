package com.sh.bbs2017.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.bbs2007.service.CategoryService;
import com.sh.bbs2017.model.Category;

public class CategoryAction extends ActionSupport {
	private List<Category> categories; // ���ڽ��ղ�ѯ����
	private CategoryService categoryService = new CategoryService();// ����model,û�в������䣬�ֶ�new
	private Category category;// ���������ݽ���ʱ���Զ�new
	private int id;

	public String list() {
		categories = categoryService.list();
		return SUCCESS;
	}

	public String add() {
		categoryService.add(category);
		return SUCCESS;
	}

	public String addInput() {
		return INPUT;
	}

	public String delete() {
		categoryService.deleteById(id);
		return SUCCESS;
	}

	public String update() {
		categoryService.update(category);
		return SUCCESS;
	}

	public String updateInput() {
		category = categoryService.updateById(id);
		return INPUT;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
