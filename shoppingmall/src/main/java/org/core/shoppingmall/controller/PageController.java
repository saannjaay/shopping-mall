/**
 * 
 */
package org.core.shoppingmall.controller;

import java.util.Iterator;

import org.core.shoppingbackend.dao.CategoryDAO;
import org.core.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sannj
 *
 */

@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })

	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "home");

		/* passing list of category */
		mv.addObject("categories", categoryDAO.list());

		Iterator<Category> ca = categoryDAO.list().iterator();
		while (ca.hasNext()) {
			

		}

		

		mv.addObject("UserClickHome", true);

		return mv;

	}

	@RequestMapping(value = "/about")

	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "page");
		mv.addObject("UserClickAbout", true);

		return mv;

	}

	@RequestMapping(value = "/contact")

	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "page");
		mv.addObject("UserClickContact", true);

		return mv;

	}

	@RequestMapping(value = "/listProduct")

	public ModelAndView listProducts() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "page");
		mv.addObject("userClickAllproducts", true);
		System.out.println(mv);

		return mv;

	}

	/* Show all 
	 * 
	 * product */
	@RequestMapping(value = "/show/all/products")

	public ModelAndView showAllProduct() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		

		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickCategoryProducts", true);

		return mv;

	}

	@RequestMapping(value = "/show/category/{id}/products")

	public ModelAndView showCategoryProduct(@PathVariable("id") int id) {
		/* categoryDao to fetch single */

		Category category = null;
		category = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", category.getName());

		 /*passing list of category */
		System.out.println(categoryDAO.list());

		mv.addObject("categories", categoryDAO.list());
		 /*passing single category of object */

		mv.addObject("category", category);

		mv.addObject("userClickCategoryProducts", true);

		return mv;

	}
}
