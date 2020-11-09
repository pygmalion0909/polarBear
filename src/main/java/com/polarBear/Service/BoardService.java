package com.polarBear.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polarBear.Dto.BoardDto;
import com.polarBear.Mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	/**
	 * @title 게시판 조회
	 */
	public List<BoardDto> selectBoardList(BoardDto boardDto){
		//list count
		boardDto.setTotalRow(boardMapper.selectBoardListCount());
		
		return boardMapper.selectBoardList(boardDto);
	}
	
	/**
	 * @title 게시판 상세
	 */
	public BoardDto selectBoardDetail(String id) {
		return boardMapper.selectBoardDetail(id);
	}
	
}
