package com.bitcamp.customview;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

@Component(value = "pagesRanksPDF")
public class PageReportViewPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<PageRanks> pageRanks = (List<PageRanks>) model.get("pageRanks");

		BaseFont bfKorean = BaseFont.createFont("c:\\windows\\fonts\\batang.ttc,0", BaseFont.IDENTITY_H,
				BaseFont.EMBEDDED);
		
		Font font = new Font(bfKorean);

		Paragraph p = new Paragraph("페이지 순위 Report",font);

		// 테이블의 사이즈 정의 ( 열/칸, 행 )
		Table table = new Table(2, pageRanks.size() + 1);
		table.setPadding(5);
		Cell cell = new Cell(new Paragraph("순위",font));
		cell.setHeader(true);
		table.addCell(cell);
		cell = new Cell(new Paragraph("page"));
		table.addCell(cell);
		table.endHeaders();
		for (PageRanks rank : pageRanks) {
			table.addCell(Integer.toString(rank.getRank()));
			table.addCell(rank.getPage());
		}
		
		document.add(p);
		document.add(table);

	}
	
	
	
	
	
	

}
