package com.polarBear.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.polarBear.Dto.BoardDto;

@Mapper
public interface BoardMapper {
	//게시판조회
	public List<BoardDto> selectBoardList();
}
