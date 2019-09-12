package com.tanmoy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.dao.UserDao;
import com.tanmoy.model.User;

@RestController
public class UserController extends BaseController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable int id) {
		return userDao.findOne(id);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public User saveUser(@RequestBody @Valid User user) {
		return userDao.save(user);
	}
	
}
