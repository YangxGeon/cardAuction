package com.cardproject.myapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.cardproject.myapp.service.CommunityService;

@Controller
@RequestMapping("/community")
public class CommunityController {

	@Autowired
	CommunityService cService;

	/*
	 * // ��ü �Ϲ���ȸ ( ����¡ ó�� �� �� ���� ���� .. 1�̸� 1-10 / 2�̸� 2-10 / �Ѱ���/10 �ؼ���ŭ ������ ��ư ���� )
	 * @GetMapping("/BoardSelect.do") public void BoardSelect(Model model) {
	 * System.out.println("/community/BoardSelect.do ��û");
	 * 
	 * Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
	 * String message = ""; if(flashMap != null) { flashMap.get("resultMessage"); }
	 * 
	 * List<CommunityDTO> blist = cService }
	 */
	
	@GetMapping("/BoardDetail.do")
	public void BoardDetail() {
		cService.test(); // community mybatis test
	}

	@GetMapping("/BoardInsert.do")
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
