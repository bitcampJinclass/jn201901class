package com.bitcamp.mvc;

import org.springframework.web.multipart.MultipartFile;

public class Report {
	
	private String sno;
	private MultipartFile report;
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public MultipartFile getReport() {
		return report;
	}
	public void setReport(MultipartFile report) {
		this.report = report;
	}
	
	public String getFileName() {
		return report.getOriginalFilename();
	}
	@Override
	public String toString() {
		return "Report [sno=" 
					+ sno 
					+ ", report=" 
					+ report.getOriginalFilename() 
					+"("+report.getSize()+")" 
					+ "]";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
