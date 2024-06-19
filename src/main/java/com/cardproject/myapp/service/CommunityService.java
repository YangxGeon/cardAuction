package com.cardproject.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardproject.myapp.dao.CommunityDAO;
import com.cardproject.myapp.dto.CommunityDTO;

@Service
public class CommunityService {
	
	@Autowired
	CommunityDAO communityDao;
	
	// ��ü �Ϲ���ȸ
	public List<CommunityDTO> selectAll(){
		return communityDao.selectAll();
	}
	
	public void test() {
		communityDao.test();
	}
	
}
