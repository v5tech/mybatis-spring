package org.mybatis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/index")
public class IndexController {
	
	
	public String index(){
		return "";
	}
	
	
}
