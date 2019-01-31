package com.bitcamp.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	
	@RequestMapping("/fileupload/upload2")
	public String getReport2(
			
			MultipartHttpServletRequest request ,
			Model model
			
			) {
		
		String sno = request.getParameter("sno");
		MultipartFile file = request.getFile("report");
		
		String fileName = file.getOriginalFilename();
		Long fileSize = file.getSize();
		
		model.addAttribute("result"
				, sno+"(첨부파일:"+fileName+ ": "+fileSize+")");
		
		return "fileupload/upload";
	}
	

	
	@RequestMapping("/fileupload/upload3")
	public String getReport3(
						
			Report report ,
			Model model
			
			) {
		
		String sno = report.getSno();
		MultipartFile file = report.getReport();
		
		String fileName = file.getOriginalFilename();
		Long fileSize = file.getSize();
		
		model.addAttribute("result"
				, sno+"(첨부파일:"+fileName+ ": "+fileSize+")");
		
		return "fileupload/upload3";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
