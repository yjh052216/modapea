package com.inha.biz.book;

public class BookVO {
	
	private String id;
	private String name;
	private String writer;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", name=" + name + ", writer=" + writer + "]";
	}
	
	

}
