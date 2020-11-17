package com.polarBear.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.polarBear.Dto.UserDto;

@Mapper
public interface UserMapper {
	public UserDto selectUserOne(String loginId);
}
