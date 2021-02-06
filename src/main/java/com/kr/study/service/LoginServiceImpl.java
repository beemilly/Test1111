package com.kr.study.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.LoginDao;
import com.kr.study.dto.UserInfoDto;
@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		String result = dao.loginCheck(dto);

		logger.info("id의 값은" + result +" 입니다.");
		if("admin".equals(result)) {
			mv.setViewName("redirect:/userInfo");
		} else if(result != null) {
			mv.addObject("msg", result +"님 환영합니다.");
			mv.setViewName("test");
		} else {
			mv.addObject("msg", "아이디 또는 패스워드가 일치하지 않습니다.");
			mv.setViewName("home");
		}

		return mv;
	}

}
