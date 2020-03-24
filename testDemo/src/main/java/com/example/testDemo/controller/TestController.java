package com.example.testDemo.controller;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.testDemo.pojo.ProjectTestBean;
import com.example.testDemo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name",defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	@RequestMapping("/find")
	public String find() {
		ProjectTestBean projectTestBean = testService.find(1);
		
		return "Success  ----- "+projectTestBean.toString();
	}
}
