package servlet;

import java.io.IOException;
import java.net.Inet4Address;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Date date= new Date(System.currentTimeMillis());
		SimpleDateFormat datef= new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss");
		InetAddress ip4 = Inet4Address.getLocalHost();
		
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		String postTime =datef.format(date);
		String ip =ip4.getHostAddress();
		ArticleServlet a=new ArticleServlet();
		a.Add(id, content, postTime, ip);
		response.sendRedirect("ArticleServlet");//重定向
		//request.getRequestDispatcher("ArticleServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
