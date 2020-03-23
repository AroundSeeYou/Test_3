package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	  String username=null;
		
			Cookie[] cookies= request.getCookies();
			if(cookies != null) {
				for(Cookie cookie: cookies) {
					System.out.println(cookie.getName()+":"+cookie.getValue());
					if("username".equals(cookie.getName()))
						username= cookie.getValue();
				}
			}
			request.setAttribute("username", username);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}


	
