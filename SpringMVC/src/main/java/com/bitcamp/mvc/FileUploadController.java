package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	
	@RequestMapping("/fileupload/form")
	public String form() {
		return "fileupload/form";
	}
	
	@RequestMapping("/fileupload/upload1")
	public String getReport1(
			
			@RequestParam("sno") String sno,
			@RequestParam("report") MultipartFile file,
			Model model
			
			) {
		
		String fileName = file.getOriginalFilename();
		Long fileSize = file.getSize();
		
		model.addAttribute("result"
				, sno+"(첨부파일:"+fileName+ ": "+fileSize+")");
		
		
		
		return "fileupload/upload";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
