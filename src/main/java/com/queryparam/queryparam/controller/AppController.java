package com.queryparam.queryparam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/queryparam")
	public String simpleQuery(@RequestParam("name") String name){
		return "response of query param is ="+name;
	}
	
	@RequestMapping("/queryparamWithRequired")
	public String queryparamWithRequired(@RequestParam(value="name", required=false) String name){
		return "response of query param is ="+name;
	}
	
	@RequestMapping("/queryparamWithRequiredWithDefaultValue")
	public String queryparamWithRequiredWithDefaultValue(@RequestParam(value="name",required=true, defaultValue="test") String name){
		return "response of query param is ="+name;
	}
	
	@RequestMapping("/multiValueQueryParam")
	public String multiValueQueryParam(@RequestParam(value="name") String name, @RequestParam(value="id") long id){
		return "response of query param is ="+name+" and Id ="+id;
	}
	

}
