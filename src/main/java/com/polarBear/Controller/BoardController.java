package com.polarBear.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.polarBear.Service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/boardList")
	public String boardListPage(Model model) {
		model.addAttribute("list", boardService.selectBoardList());
		return "board/boardList";
	}
	
	@RequestMapping(value="/boardDetail")
	public String boardDetailPage() {
		return "board/boardDetail";
	}
	
}
