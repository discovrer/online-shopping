package net.discovrer.shoppingbackend.dao;

import java.util.List;

import net.discovrer.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
}
