package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	public @ResponseBody List<String>  test(){
		List<String> sList=new ArrayList<>();
		sList.add("It ");
		sList.add("is ");
		sList.add("a ");
		sList.add("json ");
		return sList;
	}
}
