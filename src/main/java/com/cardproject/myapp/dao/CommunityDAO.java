package com.cardproject.myapp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cardproject.myapp.dto.CommunityDTO;

@Repository
public class CommunityDAO{

	@Autowired
	SqlSession sqlSession;

	String namespace = "com.cardproject.myapp.dao.";
	
	// ��ü �Ϲ���ȸ ( ����¡ ó�� �� �� ���� ���� .. 1�̸� 1-10 / 2�̸� 2-10 / �Ѱ���/10 �ؼ���ŭ ������ ��ư ���� )
	public List<CommunityDTO> selectAll(){
		List<CommunityDTO> blist = sqlSession.selectList(namespace + "selectAll");
		return blist;
	}
	
	// test
	public void test() {
		CommunityDTO var = sqlSession.selectOne(namespace + "selectTest");
		System.out.println(var);
	}

	

}
