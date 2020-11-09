package com.polarBear.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
	private String id;
	private String userId;
	private String loginId;
	private String title;
	private String content;
	private Integer views;
	private String createDate;
	private String modifyDate;
}
