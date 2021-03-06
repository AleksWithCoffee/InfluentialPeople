package com.influentialpeople.history.config.pojo;

public class Heroes {
	private String name;
	private Integer id;

	public Heroes(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Heroes [name=" + name + ", id=" + id + "]";
	}

}
