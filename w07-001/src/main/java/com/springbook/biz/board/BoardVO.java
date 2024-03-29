package com.springbook.biz.board;

import java.sql.Date;

public class BoardVO {
	
	private int seq;
	private String title;
	private String witer;
	private String content;
	private Date regDate;
	private int cnt;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWiter() {
		return witer;
	}
	public void setWiter(String witter) {
		this.witer = witter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String context) {
		this.content = context;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", witer=" + witer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}
	
	
	
}
