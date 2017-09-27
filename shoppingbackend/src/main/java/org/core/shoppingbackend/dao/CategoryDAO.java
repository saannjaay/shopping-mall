/**
 * 
 */
package org.core.shoppingbackend.dao;

import java.util.List;

import org.core.shoppingbackend.dto.Category;


/**
 * @author sannj
 *
 */
public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);

	
	
	

}
