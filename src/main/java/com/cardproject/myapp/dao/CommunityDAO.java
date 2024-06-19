package com.cardproject.myapp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cardproject.myapp.dto.BoardListDTO;

@Repository
public class CommunityDAO{

	@Autowired
	SqlSession sqlSession;

	String namespace = "com.cardproject.myapp.dao.";
	
	// �Խñ� ����Ʈ ��ȸ
	public List<BoardListDTO> selectBoardList(){
		List<BoardListDTO> blist = sqlSession.selectList(namespace + "selectBoardList");
		return blist;
	}
	
	// �Խñ� �� ��ȸ
	public BoardListDTO selectBoardByCommId(Integer commId) {
		BoardListDTO board = sqlSession.selectOne(namespace + "selectByCommId", commId);
		return board;
	}

}
