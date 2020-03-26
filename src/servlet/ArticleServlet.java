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
	private static List<String> list1 = new ArrayList<>();
	private static List<String> list2 = new ArrayList<>();
	private static List<String> list4 = new ArrayList<>();
	private static List<String> list3 = new ArrayList<>();
	
	public static void Delete(String a) {
		int len = list1.size();
		for(int i=0;i<len;i++) {
			if((list1.get(i)).equals(a)) {
				list1.remove(i);
				list2.remove(i);
				list3.remove(i);
				list4.remove(i);
				i--;
				break;
			}
		}
	}
	public static void Add(String a,String b,String c,String d) {
		list1.add(a);
		list2.add(b);
		list3.add(c);
		list4.add(d);	
	}
	public static void Update(String a,String b,String c,String d) {
		System.out.println(a);
		int len = list1.size();
		for(int i=0;i<len;i++) {
			if((list1.get(i)).equals(a)) {
				list1.set(i, a);
				list2.set(i, b);
				list3.set(i, c);
				list4.set(i, d);
				break;
			}
			
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("id", list1);
		request.setAttribute("content", list2);
		request.setAttribute("postTime", list3);
		request.setAttribute("ip", list4);
		request.setAttribute("len", list1.size());
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
