package jdbc;

import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class Loader extends HttpServlet {
	

	public void init(ServletConfig config) throws ServletException {
		
		try {
		String driver = config.getInitParameter("jdbcdriver");
		
		StringTokenizer st = new StringTokenizer(driver, ",");
		
		while(st.hasMoreTokens()) {
			String jdbcDriver = st.nextToken();
			
			// 데이터베이스 드라이버 로드
			Class.forName(jdbcDriver);
			
			System.out.println("데이터베이스 드라이버 로드 완료!!");
			
			
		} 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
