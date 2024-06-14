package com.java.beans;

public class Document {
	private int id;
	private String name;
	private int pageCount;
	
	public Document() {
	}

	public Document(int id, String name, int pageCount) {
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", pageCount=" + pageCount + "]";
	}

}
