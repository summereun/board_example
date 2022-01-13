package org.jeh.controller;

import java.util.ArrayList;

import org.jeh.domain.BoardDTO;
import org.jeh.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	//---------------------------------
	// 게시판에 글쓰는 화면 띄우기
	@GetMapping("write")
	public void write() {
		// 메서드가 제대로 돌아가는지 확인용
		System.out.println("board/write");
	}
	
	//---------------------------------
	// 게시판 글쓰기 버튼 누르면...
	@PostMapping("write")
	public String writePost(BoardDTO board) {
		System.out.println("글쓰기 버튼을 눌렀습니다" + board);
		
		service.write(board);
		return "redirect:/board/list";
	}
	//---------------------------------
	// 게시판 목록 리스트
	@GetMapping("list")
	public void list(Model model) {
		service.list();
		System.out.println("boardlist 결과는 = " + service.list());
		model.addAttribute("list", service.list());
	}
	
	//---------------------------------
	// 게시판 목록 리스트에서 제목을 클릭하면...
	@GetMapping("detail")
	public void detail(BoardDTO board, Model model) {
		service.detail(board);
		model.addAttribute("detail", service.detail(board));
	}
	
	//---------------------------------
	// 게시판 상세 페이지에서 글 수정 화면으로...
	@GetMapping("modify")
	public void modify(BoardDTO board, Model model) {
		service.detail(board);
		model.addAttribute("detail", service.detail(board));
	
	}
	
	//---------------------------------
	// 글 수정 버튼을 누르면...
	@PostMapping("modify")
	public String modifyPost(BoardDTO board, RedirectAttributes rttr) {
		service.modify(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/detail";
	}
	
	//---------------------------------
	// 글 삭제 버튼을 누르면...
	@GetMapping("remove")
	public String remove(BoardDTO board) {
		service.remove(board);
		return "redirect:/board/list";
	}
}
