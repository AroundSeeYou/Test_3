package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArticleServlet
 */
@WebServlet("/ArticleServlet")
public class ArticleServlet extends HttpServlet {
	private static List<Article> list = new ArrayList<>();
	public static void Delete(String a) {
		int len = list.size();
		for(int i=0;i<len;i++) {
			if((list.get(i).getId()).equals(a)) {
				list.remove(i);
				i--;
				break;
			}
		}
	}
	public static void Add(String a,String b,String c,String d) {
		Article article=new Article(a,b,c,d);
		list.add(article);
	}
	public static void Update(String a,String b,String c,String d) {
		System.out.println(a);
		int len = list.size();
		for(int i=0;i<len;i++) {
			if((list.get(i).getId()).equals(a)) {
				Article article=new Article(a,b,c,d);
				list.set(i, article);
				break;
			}
			
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("article", list);
		request.setAttribute("len", list.size());
		request.getRequestDispatcher("article.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
