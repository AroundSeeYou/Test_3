package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		
		String email = request.getParameter("email");
		/*System.out.println(username);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(email);
		request.setAttribute("username", username);
		request.setAttribute("age", age);
		request.setAttribute("sex", sex);
		request.setAttribute("email", email);*/
		//request.setAttribute("username", username);
		Cookie cookie= new Cookie("username", username);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		
		//request.getRequestDispatcher("IndexServlet").forward(request, response);
		response.sendRedirect("IndexServlet");//重定向
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
