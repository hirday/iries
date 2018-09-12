package com.iries.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iries.dao.UserDAO;
import com.iries.model.User;

public class UserDAOImpl implements UserDAO{

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User saved successfully, User Details="+user);
		
	}

	@Override
	public void updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
		logger.info("User updated successfully, User Details="+user);
	}

	@Override
	public List<User> listUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		for(User user : userList){
			logger.info("User List::"+user);
		}
		return userList;
	}

	@Override
	public User getUserByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();		
		User user = (User) session.load(User.class, name);
		logger.info("User loaded successfully, User details="+user);
		return user;
	}

}
