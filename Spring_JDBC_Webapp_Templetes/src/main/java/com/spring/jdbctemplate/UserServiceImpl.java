package com.spring.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
		@Autowired
		UserDao userDao;
		

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.register(user);
	}


	@Override
	public List<User> getallUser() {
		// TODO Auto-generated method stub
		 return userDao.getallUsers();
	
	}


	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}


	@Override
	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		userDao.UpdateUser(user);
		
	}

}
