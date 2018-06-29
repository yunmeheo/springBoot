package com.yunmi.springBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@RequestMapping(value="/")
	@ResponseBody
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value="/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "it's message");
		return "hello";
	}
	
}
