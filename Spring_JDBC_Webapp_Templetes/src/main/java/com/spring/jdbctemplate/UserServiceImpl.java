package com.spring.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
		@Autowired
		UserDao userDao;
		

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.register(user);
	}

}
