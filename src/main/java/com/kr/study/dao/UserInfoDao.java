package com.kr.study.dao;

import java.util.List;

import com.kr.study.dto.UserInfoDto;

public interface UserInfoDao {

	List<UserInfoDto> userInfo();

	int createNewAccount(UserInfoDto dto);

	UserInfoDto moveModifyUserInfo(String id);

	int modifyUserInfo(UserInfoDto dto);

}
