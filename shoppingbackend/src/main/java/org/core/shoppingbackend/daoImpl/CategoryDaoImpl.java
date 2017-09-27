/**
 * 
 */
package org.core.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.core.shoppingbackend.dao.CategoryDAO;
import org.core.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

/**
 * @author sannj
 *
 */


@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.core.shoppingbackend.dao.CategoryDAO#list()
	 */

	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		
		/*tv*/
		category.setId(1);
		category.setName("TELIVISION");
		category.setDescription("this is discription for TV");
		category.setImageURL("PG_ING.JPG");
		categories.add(category);
		/* LED TV */
		category = new Category();
		category.setId(2);
		category.setName("LED TV");
		category.setDescription("this is discription for LED TV");
		category.setImageURL("PG_ING.JPG");
		categories.add(category);
		
		/* MOBILE */
		category = new Category();
		category.setId(3);
		category.setName("MOBILE");
		category.setDescription("this is discription for mobile");
		category.setImageURL("PG_ING.JPG");
		categories.add(category);

	}

	@Override
	public List<Category> list() {
		
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {

			if (category.getId() == id)
				return category;
		}
		return null;
		
	}


	
	
		
	
}
