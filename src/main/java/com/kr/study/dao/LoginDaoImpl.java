package com.kr.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.dto.UserInfoDto;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SqlSessionTemplate sqlsession;

	@Override
	public String loginCheck(UserInfoDto dto) {

		String result = sqlsession.selectOne("UserInfo.selectId", dto);

		return result;
	}













}
