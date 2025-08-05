package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller
public class BoardController {

	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList() {
		
		Board vo = new Board();
		vo.setIdx(1);
		vo.setTitle("게시판실습");
		vo.setContent("게시판실습");
		vo.setWriter("박매일");
		vo.setIndate("2022-05-10");
		vo.setCount(0);
		
		
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		return "boardList"; // -> /WEB-INF/views
		// 전체적인 경로를 만드는 클래스 => viewResolver
	}
}
