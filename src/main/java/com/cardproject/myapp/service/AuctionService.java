package com.cardproject.myapp.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardproject.myapp.dao.AuctionDAO;
import com.cardproject.myapp.dto.ItemDTO;
import com.cardproject.myapp.dto.PokemonDTO;

@Service
public class AuctionService {
	
	@Autowired
	AuctionDAO aucDAO;
	
	public void test() {
		aucDAO.test();
	}
	public int itemInsert(ItemDTO item) {
		System.out.println(item);
		//�Ǹ��� ���̵� session���� �޾Ƽ� set
		item.setUser_id("seoyeon");
		//�������� ���� ��¥,�ð����� set
		java.util.Date now = new java.util.Date();
	    item.setCreate_date(new Date(now.getTime()));
	    
	    // end_date
	    String endDate=item.getEnd_date().replace("T", " ");
	    item.setEnd_date(endDate);
	    		
        
	    //ī�װ� (���߿� if�� �з�)
		item.setCat(0);
		item.setImage1("test.png");
		
		System.out.println(item);
		return aucDAO.itemInsert(item);
	}
	public List<PokemonDTO> selectPCardName() {
		return aucDAO.selectPCardName();
	}
	
}
