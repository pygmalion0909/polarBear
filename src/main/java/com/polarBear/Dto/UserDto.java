package com.polarBear.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	private String id;
	private String loginId;
	private String password;
	private String createDate;
	private String modifyDate;
}
