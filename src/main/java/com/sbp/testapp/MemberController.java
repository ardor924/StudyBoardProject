package com.sbp.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbp.mapper.MemberMapper;

@Controller
public class MemberController {

	// 맵퍼 주입
	@Autowired MemberMapper memberMapper;
	
	
	// 회원가입 페이지 전환
	@RequestMapping("/memberRegisterPage.do")
	public String membeRegisterPage() {
		
		return "member/register_page";
	}
	
	// 로그인 페이지 전환
	@RequestMapping("/memberLoginPage.do")
	public String memberLoginPage() {
		
		return "member/login_page";
	}
	
	
	
}
