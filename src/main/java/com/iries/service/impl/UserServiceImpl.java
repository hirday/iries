package com.iries.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iries.dao.UserDAO;
import com.iries.model.User;
import com.iries.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		this.userDAO.updateUser(user);
	}

	@Override
	@Transactional
	public List<User> listUser() {
		return this.userDAO.listUser();
	}
	
	@Override
	@Transactional
	public User getUserByName(String name) {
		return this.userDAO.getUserByName(name);
	}

}
