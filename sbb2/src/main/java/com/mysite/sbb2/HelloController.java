package com.mysite.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	//HelloController 객체 생성
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return ("sbb2 입니다.");
	}

}