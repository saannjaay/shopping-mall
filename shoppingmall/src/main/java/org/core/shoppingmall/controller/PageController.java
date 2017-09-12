/**
 * 
 */
package org.core.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sannj
 *
 */

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })

	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "home");
		mv.addObject("UserClickHome", true);
		System.out.println("hello ");

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

	

}
