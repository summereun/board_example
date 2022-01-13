package org.jeh.controller;

import org.jeh.DTO.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // MVC 중에서 C 역할을 하게끔 지정
public class SampleController {
	// 스프링 프레임워크에서 콘솔에 찍어주기 위한 클래스(PRINTLN과 같은 역할)
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="sample", method = RequestMethod.GET)
	public void basic() {
		logger.info("sample 실행됨");
	}
	
	// 매개변수에 추가하거나(오버라이딩) 메소드 이름을 다르게 하면 괜찮지만, 위와 똑같으면 에러
	@RequestMapping(value="sample/ex01", method = RequestMethod.GET)
	public String basic1() {
		logger.info("sample/ex01 실행됨");
		return "ex01";
	}
	
	@RequestMapping(value="sample/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="sample/member", method=RequestMethod.GET)
	public String member(String id, String pw, String name) {
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		System.out.println("name = " + name);
		return "member";
	}
	
	@RequestMapping(value="sample/memberDTO", method=RequestMethod.GET)
	public void memberdto(SampleMemberDTO smd) {
		System.out.println("id = " + smd.getId());
		System.out.println("pw = " + smd.getPw());
		System.out.println("name = " + smd.getName());
	}
	
	@RequestMapping(value="stb", method=RequestMethod.GET)
	public String header() {
		return "stb";
	}


}
