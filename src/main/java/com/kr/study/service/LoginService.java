package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfoDto;

public interface LoginService {

	ModelAndView loginCheck(UserInfoDto dto);

}
