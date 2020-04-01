package servlet;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import list.articleList;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("article_update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*获取时间*/
		Date date= new Date(System.currentTimeMillis());
		SimpleDateFormat datef= new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss");
		/*获取地址*/
		InetAddress ip4 = Inet4Address.getLocalHost();
		
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		String postTime =datef.format(date);
		String ip =ip4.getHostAddress();
		Article article=new Article(id,content,postTime,ip);
		articleList.Update(article);
		response.sendRedirect("ArticleServlet");//重定向
	}

}
