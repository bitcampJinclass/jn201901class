package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		try {
			/////////////////////////////////////////
			// 요청 데이터 분석
			String type = req.getParameter("type");

			/////////////////////////////////////////
			// !!!!!!!!!!!
			// 응답 페이지 ( view 지정 )
			String viewPage = "/simpleView.jsp";

			/////////////////////////////////////////
			// 결과 데이터
			Object resultObj = null;

			if (type == null || type.equals("greeting")) {

				resultObj = "안녕하세요";
				viewPage = "/greeting.jsp";

			} else if (type.equals("date")) {

				resultObj = new Date();
				viewPage = "/date.jsp";

			} else {

				resultObj = "Invalid Type";

			}
			
			
			
			///////////////////////////////////////////
			
			req.setAttribute("result", resultObj);
			
			

			///////////////////////////////////////////

			RequestDispatcher dispatcher = 
					req.getRequestDispatcher(viewPage);

			dispatcher.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
