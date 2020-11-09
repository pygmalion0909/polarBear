package com.polarBear.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.polarBear.Dto.BoardDto;

@Mapper
public interface BoardMapper {
	//게시판 리스트 카운트
	public int selectBoardListCount();
	//게시판조회
	public List<BoardDto> selectBoardList(BoardDto boardDto);
	//게시판상세조회
	public BoardDto selectBoardDetail(String id);
}
