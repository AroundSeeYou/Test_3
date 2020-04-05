package list;

import java.util.ArrayList;
import java.util.List;

import servlet.Article;

public class articleList {
public static List<Article> list = new ArrayList<>();
	
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
	public static void Add(Article article) {
		
		list.add(article);
	}
	public static List getList() {
		return list;
	}
	public static void Update(Article article) {
		
		int len = list.size();
		for(int i=0;i<len;i++) {
			if((list.get(i).getId()).equals(article.getId())) {
				list.set(i, article);
				break;
			}
			
		}
	}
}
