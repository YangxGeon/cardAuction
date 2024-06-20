package com.cardproject.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cardproject.myapp.dto.BoardListDTO;
import com.cardproject.myapp.service.CommunityService;

@Controller
@RequestMapping("/community")
public class CommunityController {

	@Autowired
	CommunityService cService;

	// �Խñ� ����Ʈ ��ȸ
	@GetMapping("/BoardSelect.do")
	public String BoardSelect(Model model) {
		System.out.println("/community/BoardSelect.do get��û");

		List<BoardListDTO> blist = cService.selectBoardList();
		System.out.println(blist);
		model.addAttribute("blist", blist);
		return "community/BoardSelect";
	}

	// �Խñ� �� ��ȸ
	@GetMapping("/BoardDetail.do")
	public String BoardDetail(Integer commId, Model model) {
		System.out.println("/community/BoardDetail.do get��û");
		
		cService.updateViews(commId); // �� ��ȸ�� ��ȸ�� ����
		model.addAttribute("board", cService.selectBoardByCommId(commId));
		return "community/BoardDetail";
	}

	// �Խñ� ��� ������
	@GetMapping("/BoardInsert.do")
	public void BoardInsertPage() {
		System.out.println("/community/BoardDetail.do get��û");
	}

	// �Խñ� ���
	@PostMapping("/BoardInsert.do")
	public void BoardInsert() {

	}

	@GetMapping("/BoardModify.do")
	public void BoardModify() {
	}

	@GetMapping("/InquirySelect.do")
	public void InquirySelect() {

	}

	@GetMapping("/InquiryDetail.do")
	public void InquiryDetail() {
	}

	@GetMapping("/InquiryInsert.do")
	public void InquiryInsert() {
	}
}
