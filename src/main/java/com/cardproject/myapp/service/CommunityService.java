package com.cardproject.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardproject.myapp.dao.CommunityDAO;
import com.cardproject.myapp.dto.BoardListDTO;

@Service
public class CommunityService {

	@Autowired
	CommunityDAO communityDao;

	// �Խñ� ����Ʈ ��ȸ
	public List<BoardListDTO> selectBoardList() {
		return communityDao.selectBoardList();
	}
	
	// �Խñ� �� ��ȸ
	public BoardListDTO selectBoardByCommId(Integer commId) {
		return communityDao.selectBoardByCommId(commId);
	}

}
