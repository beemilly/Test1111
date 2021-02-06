package com.kr.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.UserInfoDao;
import com.kr.study.dto.UserInfoDto;
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDao dao;

	@Override
	public ModelAndView userInfo() {

		ModelAndView mv = new ModelAndView("user_info");

		List<UserInfoDto> dtoList = dao.userInfo();

		mv.addObject("dtoList", dtoList);

		return mv;
	}

	@Override
	public ModelAndView createNewAccount(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		int result = dao.createNewAccount(dto);

		if(result > 0) {
			mv.setViewName("redirect:/userInfo");
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "오류가 발생했습니다. 확인후 다시 실행해주세요.");
		}

		return mv;
	}

	@Override
	public ModelAndView moveModifyUserInfo(String id) {

		ModelAndView mv = new ModelAndView();

		UserInfoDto dto = dao.moveModifyUserInfo(id);

		if(dto.getId() != null) {
			mv.setViewName("modify_user_info");
			mv.addObject("dto", dto);
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "오류가 발생했습니다. 확인후 다시 실행해주세요.");
		}

		return mv;
	}

	@Override
	public ModelAndView modifyUserInfo(UserInfoDto dto) {

		ModelAndView mv = new ModelAndView();

		int result = dao.modifyUserInfo(dto);

		if(result > 0) {
			mv.setViewName("redirect:/userInfo");
		} else {
			mv.setViewName("failed");
			mv.addObject("msg", "오류가 발생했습니다. 확인후 다시 실행해주세요.");
		}

		return mv;
	}

}
