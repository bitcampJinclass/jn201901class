<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String id = "";
	String pw = "";
	String photo = "";


	boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	if (isMultipart) {
		// 2. 메모리나 파일로 업로드 파일 보관하는 FileItem의 Factory 설정
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 3. 업로드 요청을 처리하는 ServletFileUpload 생성
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		// 4. 업로드 요청에서 FileItem 목록 가져오기
		List<FileItem> items = upload.parseRequest(request);
		
		Iterator<FileItem> itr = items.iterator();
		
		while(itr.hasNext()){
			FileItem item = itr.next();
			
			if(item.isFormField()){
				// 텍스트 필드
				String name = item.getFieldName();
				if(name.equals("id")){
					id = item.getString("utf-8");
				}
				if(name.equals("pw")){
					pw = item.getString("utf-8");
				}
			} else {
				// file
				
				// 웹 경로
				String uploadUri = "/upload";
				
				// 시스템의 절대경로
				String dir = request.getSession().getServletContext().getRealPath(uploadUri);
				System.out.println(dir);
				
				
				
				String name = item.getFieldName();
				if (name.equals("photo")){
					// 파일이름
					photo = item.getName(); // + " : " + item.getSize();
					item.write(new File(dir,photo));
				}
				
				
				
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료</title>
</head>
<body>

<h1>
	id : <%= id %> <br>
	pw : <%= pw %> <br>
	fileNmae : <%= photo %> <br>
	<img alt="사진" src="upload/<%= photo%>">

</h1>















</body>
</html>