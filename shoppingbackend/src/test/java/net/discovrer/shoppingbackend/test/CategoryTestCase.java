package net.discovrer.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.discovrer.shoppingbackend.dao.CategoryDAO;
import net.discovrer.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("net.discovrer.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory(){
		
		category = new Category();

		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
	}
}
