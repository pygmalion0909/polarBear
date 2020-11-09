package com.polarBear.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.polarBear.Dto.BoardDto;
import com.polarBear.Service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	/**
	 * @title 게시판 조회
	 */
	@RequestMapping(value="/boardList")
	public String boardListPage(BoardDto boardDto, Model model) {
		model.addAttribute("list", boardService.selectBoardList(boardDto));
		return "board/boardList";
	}
	
	/**
	 * @title 게시판 상세
	 */
	@RequestMapping(value="/boardDetail")
	public String boardDetailPage(String id, Model model) {
		model.addAttribute("detail", boardService.selectBoardDetail(id));
		return "board/boardDetail";
	}
	
}
