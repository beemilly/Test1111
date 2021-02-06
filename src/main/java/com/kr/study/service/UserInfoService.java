package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfoDto;

public interface UserInfoService {

	ModelAndView userInfo();

	ModelAndView createNewAccount(UserInfoDto dto);

	ModelAndView moveModifyUserInfo(String id);

	ModelAndView modifyUserInfo(UserInfoDto dto);

}
