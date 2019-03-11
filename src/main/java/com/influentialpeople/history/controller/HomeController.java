package com.influentialpeople.history.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.influentialpeople.history.config.pojo.Heroes;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("lista", getList());
		return "home";
	}

	private List<Heroes> getList() {
		Heroes hero1 = new Heroes("Magellan", 1);
		Heroes hero2 = new Heroes("Lem", 2);
		Heroes hero3 = new Heroes("Tesla", 3);
		List<Heroes> list = Arrays.asList(hero1, hero2, hero3);
		return list;
	}

}
