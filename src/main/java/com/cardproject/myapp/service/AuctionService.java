package com.cardproject.myapp.service;


import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardproject.myapp.dao.AuctionDAO;
import com.cardproject.myapp.dto.ItemDTO;
import com.cardproject.myapp.dto.ItemDetailDTO;
import com.cardproject.myapp.dto.PokemonDTO;

@Service
public class AuctionService {
	
	@Autowired
	AuctionDAO aucDAO;
	
	public void test() {
		aucDAO.test();
	}
	public List<ItemDetailDTO> selectItemRecent() {
		return aucDAO.selectItemRecent();
	}
	public int itemInsert(ItemDTO item) {
		System.out.println(item);
		//�Ǹ��� ���̵� session���� �޾Ƽ� set
		item.setUser_id("seoyeon");
		//�������� ���� ��¥,�ð����� set
		java.util.Date now = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = sdf.format(now);
		item.setCreate_date(formattedDate);
	    
	    
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
	public List<ItemDetailDTO> getSortedItemList(String sortOption) {
		if (sortOption == null) {
            return aucDAO.selectItemRecent();
        }
		switch (sortOption) {
		case "recent":
			return aucDAO.selectItemRecent();
		case "ending":
			return aucDAO.selectItemEnding();
		case "mostpeople":
			return aucDAO.selectItemMost();
		case "leastpeople":
			return aucDAO.selectItemLeast();
		default:
			return aucDAO.selectItemRecent();
		}
		
	}
	
}
