package org.jeh.service;

import java.util.ArrayList;

import org.jeh.domain.BoardDTO;
import org.jeh.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceimpl implements BoardService{
	@Autowired
	private BoardMapper bmapper;
	
	public void write(BoardDTO board) {
		bmapper.write(board);
	}
	
	public ArrayList<BoardDTO> list() {
		return bmapper.list();
	}
	
	public BoardDTO detail(BoardDTO board) {
		return bmapper.detail(board);
	}
	
	public void modify(BoardDTO board) {
		bmapper.modify(board);
	}
	
	public void remove(BoardDTO board) {
		bmapper.remove(board);
	}
}
