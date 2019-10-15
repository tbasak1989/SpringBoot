package com.tanmoy.controller;

public class Question {

	private Integer id;
	private String name;
	private Double rating;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(Integer id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
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
}
