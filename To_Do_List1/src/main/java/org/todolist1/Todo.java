package org.todolist1;

public class Todo {

	@Override
	public String toString() {
		return "Todo [content=" + content + ", id=" + id + "]";
	}

	private String content;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
