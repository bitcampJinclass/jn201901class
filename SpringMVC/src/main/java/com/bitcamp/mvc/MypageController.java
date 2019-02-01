package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {

	@RequestMapping("/mypage/mypage1")
	public String getMypage() {
		return "mypage/view";
	}

	@RequestMapping("/mypage/mypage2")
	public String getMypage2() {
		return "mypage/view";
	}
}
