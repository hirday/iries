package com.iries.dao;

import java.util.List;

import com.iries.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUser();
	public User getUserByName(String name);
}
