package com.bitcamp.customview;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractExcelView;

@Component(value="pagesRanks")
@SuppressWarnings("deprecation")
public class PageranksXlsView
	extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(
			Map<String, Object> model, 
			HSSFWorkbook workbook, 
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// 1. 시트 만들기			
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(0, "페이지 순위");
		sheet.setColumnWidth(1, 256*20);
		
		// 2. 라벨 만들기
		HSSFRow firstRow = sheet.createRow(0);
		HSSFCell cell = firstRow.createCell(0);
		cell.setCellValue("순위");
		
		cell = firstRow.createCell(1);
		cell.setCellValue("페이지");
		
		// 3. 행의 셀 만들기
		// LIST 원본 가져오기
		List<PageRanks> list = (List<PageRanks>) model.get("pageRanks");
		
		int rowNum = 1; // 첫번째 행은 라벨 처리를 했음.
		
		for(PageRanks rank : list) {
			
			// 행 만들기
			HSSFRow row = sheet.createRow(rowNum);
			
			// 순위 셀 
			HSSFCell c = row.createCell(0);
			c.setCellValue(rank.getRank());
			
			// 페이지 셀
			c = row.createCell(1);
			c.setCellValue(rank.getPage());
			
			rowNum++;
			
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
