package com.kr.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfoDto;
import com.kr.study.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping("loginCheck")
	public ModelAndView loginCheck(@ModelAttribute("home") UserInfoDto dto) {

		ModelAndView mv = service.loginCheck(dto);

		return mv;
	}


}
