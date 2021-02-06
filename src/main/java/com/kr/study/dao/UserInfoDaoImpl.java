package com.kr.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.dto.UserInfoDto;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<UserInfoDto> userInfo() {

		List<UserInfoDto> dtoList = sqlSession.selectList("UserInfo.selectAll");

		return dtoList;
	}

	@Override
	public int createNewAccount(UserInfoDto dto) {

		int result = sqlSession.insert("UserInfo.insertOne", dto);

		return result;
	}

	@Override
	public UserInfoDto moveModifyUserInfo(String id) {

		UserInfoDto dto = sqlSession.selectOne("UserInfo.selectOne", id);

		return dto;
	}

	@Override
	public int modifyUserInfo(UserInfoDto dto) {

		int result = sqlSession.update("UserInfo.updateOne", dto);

		return result;
	}

}
