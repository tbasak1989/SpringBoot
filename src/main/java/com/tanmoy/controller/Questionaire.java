package com.tanmoy.controller;

import java.util.List;

public class Questionaire {

	private String path;
	private String name;
	private List<Question> questions;
	public Questionaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questionaire(String path, String name, List<Question> questions) {
		super();
		this.path = path;
		this.name = name;
		this.questions = questions;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestion(List<Question> question) {
		this.questions = question;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
