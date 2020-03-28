package servlet;

public class Article {
	private String id;
	private String content;
	private String postTime;
	private String ip;
	public Article() {}
	public Article(String id, String content, String postTime, String ip) {
		this.id = id;
		this.content = content;
		this.postTime = postTime;
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public String getPostTime() {
		return postTime;
	}
	public String getIp() {
		return ip;
	}
	
	
	
}
