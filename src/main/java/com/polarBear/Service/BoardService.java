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
	
	//게시판 조회
	public List<BoardDto> selectBoardList(){
		return boardMapper.selectBoardList();
	}
	
}
