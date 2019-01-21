package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginCheckFilter implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(
			ServletRequest request, 
			ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		HttpSession session = httpRequest.getSession(false);
		
		boolean login = false;
		
		if(session != null && session.getAttribute("MEMBER") != null) {
			login = true;
		}
		
		if(login) {
			chain.doFilter(request, response);
		} else {
			
			//HttpServletResponse httpResponse = (HttpServletResponse)response;
			//httpResponse.sendRedirect("/loginForm.jsp");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/loginForm.jsp");
			dispatcher.forward(request, response);
					
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
