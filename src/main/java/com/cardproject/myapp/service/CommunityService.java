package com.cardproject.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardproject.myapp.dao.CommunityDAO;
import com.cardproject.myapp.dto.BoardListDTO;
import com.cardproject.myapp.dto.CommunityDTO;

@Service
public class CommunityService {

	@Autowired
	CommunityDAO communityDao;

	// 게시글 리스트 조회
	public List<BoardListDTO> selectBoardList() {
		return communityDao.selectBoardList();
	}

	// 게시글 상세 조회
	public BoardListDTO selectBoardByCommId(Integer commId) {
		return communityDao.selectBoardByCommId(commId);
	}

	// 게시글 등록 페이지 로드
	public int updateViews(Integer commId) {
		return communityDao.updateViews(commId);
	}

	// 게시글 등록
	public int insertBoard(CommunityDTO board) {
		return communityDao.insertBoard(board);
	}
	
	// 게시글 수정
	public int modifyBoard(CommunityDTO board) {
		return communityDao.modifyBoard(board);
	}
	
	// 추천
	public int incrementRecommend(Integer commId) {
		return communityDao.incrementRecommend(commId);
	}
	
	// 추천 수 조회
	public int getRecommendCount(Integer commId) {
		return communityDao.getRecommendCount(commId);
	}

}
