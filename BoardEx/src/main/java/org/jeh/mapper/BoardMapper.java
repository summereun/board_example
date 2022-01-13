package org.jeh.mapper;

import java.util.ArrayList;

import org.jeh.domain.BoardDTO;

public interface BoardMapper {
	// 게시판 글쓰기와 관련이 되어있는 DB 작업 설계
	public void write(BoardDTO board);
	
	// 게시판 리스트와 관련이 되어있는 DB 작업 설계
	public ArrayList<BoardDTO> list();
	
	// 게시판 목록 리스트에서 제목을 클릭했을 때 내용이 나오는
	// 상세페이지와 관련 되어있는 DB 작업 설계
	public BoardDTO detail(BoardDTO board);
	
	// 게시판 수정과 관련이 있는 DB 작업 설계
	public void modify(BoardDTO board);
	
	// 게시판 글 삭제와 관련이 있는 DB 작없 설계
	public void remove(BoardDTO board);
}
