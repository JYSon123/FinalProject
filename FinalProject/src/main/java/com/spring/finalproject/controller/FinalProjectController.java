package com.spring.finalproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.finalproject.service.InterFinalProjectService;

@Component
@Controller
public class FinalProjectController {
	
	@RequestMapping(value="/test1.hello")
	public String test1(HttpServletRequest request) {
		
		String name = "이순신";
		
		request.setAttribute("name", name);
		
		return "test1";
		
		// 테스트 완료! 정상출력
		
	}
	
	
	
	@RequestMapping(value="/test4.hello")
	public String test4(HttpServletRequest request) {
		
		String name = "Lee SunSin";
		
		request.setAttribute("name", name);
		
		return "test4.tiles1";
		
		// 테스트 완료! 정상출력
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	private InterFinalProjectService service;
	
	// DB 연결 확인용 메소드
	@RequestMapping(value="/index.hello")
	public String index(HttpServletRequest request) {
		
		List<String> nameList = service.getName();
		
		request.setAttribute("nameList", nameList);
		
		return "main/index.tiles1";
		
		
	}
	
	
	
	
}
