package com.kr.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfoDto;
import com.kr.study.service.UserInfoService;

@Controller
public class UserInfoController {

	@Autowired
	UserInfoService service;

	@RequestMapping("userInfo")
	public ModelAndView userInfo() {

		ModelAndView mv = service.userInfo();

		return mv;
	}

	@RequestMapping("moveCreateNewAccount")
	public String moveCreateNewAccount() {

		return "create_new_account";
	}

	@RequestMapping("createNewAccount")
	public ModelAndView createNewAccount(@ModelAttribute("create_new_account") UserInfoDto dto) {

		ModelAndView mv = service.createNewAccount(dto);

		return mv;
	}

	@RequestMapping("moveModifyUserInfo")
	public ModelAndView moveModifyUserInfo(String id) {

		ModelAndView mv = service.moveModifyUserInfo(id);

		return mv;
	}

	@RequestMapping("modifyUserInfo")
	public ModelAndView modifyUserInfo(@ModelAttribute("modify_user_info") UserInfoDto dto) {

		ModelAndView mv = service.modifyUserInfo(dto);

		return mv;
	}

}
