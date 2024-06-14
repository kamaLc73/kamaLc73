package com.jee.beans;

public class Document {
	private int id;
	private String title;
	private int pageCount;
	
	public Document() {
	}

	public Document(int id, String title, int pageCount) {
		this.id = id;
		this.title = title;
		this.pageCount = pageCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", pageCount=" + pageCount + "]";
	}

	
}
