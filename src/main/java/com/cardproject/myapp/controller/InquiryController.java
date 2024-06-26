package com.cardproject.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cardproject.myapp.dto.QuestionDTO;
import com.cardproject.myapp.dto.UserDTO;
import com.cardproject.myapp.service.AWSS3Service;
import com.cardproject.myapp.service.InquiryService;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

	@Autowired
	InquiryService iService;
	@Autowired
	private AWSS3Service s3Service;

	// 문의 리스트 조회
	@GetMapping("/InquirySelect.do")
	public String InquirySelect(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int pageSize, Model model, HttpSession session) {

		// 유저 닉네임
		String userid = (String) session.getAttribute("userid");
		if (userid != null) {
			UserDTO user = iService.selectNicknameByUserVOId(userid);
			session.setAttribute("user", user);
		}

		// 페이징
		int totalCount = iService.getTotalInquiryCount();
		List<QuestionDTO> ilist = iService.selectInquiryList(page, pageSize);

		model.addAttribute("ilist", ilist);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageSize", pageSize);

		return "inquiry/InquirySelect";
	}

	// 문의 글 상세조회
	@GetMapping("/InquiryDetail.do")
	public String InquiryDetail(Integer questId, Model model, HttpSession session) {
	    System.out.println("/inquiry/InquiryDetail.do 요청");

	    // user 닉네임
	    String userid = (String) session.getAttribute("userid");
	    if (userid != null) {
	        UserDTO user = iService.selectNicknameByUserVOId(userid);
	        session.setAttribute("user", user); // 세션에 user 객체 저장
	    }

	    QuestionDTO inquiry = iService.selectByInquiryId(questId);
	    String writer = inquiry.getUser_id();
	    Integer isSecret = inquiry.getIs_secret(); // 1: 비밀글, 0: 공개글
	    
	    if (isSecret == 1) { // 비밀글일 경우
	        if (userid == null || !userid.equals(writer)) { // 로그인 안했거나 작성자가 아니면
	            model.addAttribute("errorMessage", "열람할 수 없습니다.");
	            return "inquiry/InquirySelect";
	        }
	    }

	    model.addAttribute("inquiry", inquiry);
	    return "inquiry/InquiryDetail";
	}


	// 문의 글 등록 페이지 로드
	@GetMapping("/InquiryInsert.do")
	public void InquiryInsert(HttpSession session) {
		System.out.println("/inquiry/InquiryInsert.do get요청");

		// user 닉네임
		String userid = (String) session.getAttribute("userid");
		if (userid != null) {
			UserDTO user = iService.selectNicknameByUserVOId(userid);
			session.setAttribute("user", user); // 세션에 user 객체 저장
		}
	}

	// 문의 글 등록
	@PostMapping("/InquiryInsert.do")
	public String InquiryInsert(QuestionDTO question, MultipartHttpServletRequest file, HttpSession session) {

		// 세션에서 사용자 ID 가져오기
		String userId = (String) session.getAttribute("userid");
		question.setUser_id(userId);

		// checkbox 예외처리
		if (question.getIs_secret() == null) {
			question.setIs_secret(0);
		} else if ("on".equals(question.getIs_secret().toString())) {
			question.setIs_secret(1);
		}

		// S3에 이미지 등록
		MultipartFile image = file.getFile("imageFile");
		if (image != null && !image.isEmpty()) {
			String fileName = "community/" + System.currentTimeMillis() + "_" + image.getOriginalFilename();
			try {
				String imageUrl = s3Service.uploadObject(image, fileName);

				// 이미지 URL이 https로 시작하는 경우 http로 변경
				if (imageUrl.startsWith("https")) {
					imageUrl = "http" + imageUrl.substring(5);
				}
				question.setImage(imageUrl);
			} catch (java.io.IOException e) {
				e.printStackTrace();
				// 이미지 업로드 중 오류 발생 시 처리
				return "redirect:InquiryInsertForm.do?error=upload";
			}
		}
		System.out.println(question);

		iService.insertInquiry(question);
		return "redirect:InquirySelect.do";
	}
}
