package com.tanmoy.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tanmoy.constant.ErrorEnum;
import com.tanmoy.exception.ResourceNotFound;
import com.tanmoy.model.User;

@Repository
public class UserDao {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Tanmoy", new Date()));
		users.add(new User(2, "Tamal", new Date()));
		users.add(new User(3, "Tanu", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null)
			user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		User returnUser = users.stream().filter(user->user.getId()==id).findAny().orElse(null);
		if(returnUser!=null)
			return returnUser;
		else
			throw new ResourceNotFound(ErrorEnum.USER_NOT_FOUND.getErrorCode(), ErrorEnum.USER_NOT_FOUND.getErrorMessage());
	}
}
