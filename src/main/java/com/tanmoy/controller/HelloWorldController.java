package com.tanmoy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.dao.Message;
import com.tanmoy.dao.MessageRepository;
import com.tanmoy.model.HelloWorldBean;

@RestController
public class HelloWorldController extends BaseController {

	@Autowired
	private MessageRepository messageRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-path")
	public String helloPath() {
		return "Hello World using PATH";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path="/hello/{message}")
	public HelloWorldBean helloWorld(@PathVariable String message) {
		return new HelloWorldBean(String.format("Hello World %s", message));
	}
	
	@GetMapping(path="/hello/tanmoy")
	public HelloWorldBean helloWorld2() {
		return new HelloWorldBean(String.format("Hello Tanmoy"));
	}
	
	@GetMapping(path="/message")
	public List<Message> getMessage() {
		return (List<Message>) messageRepository.findAll();
	}
}
