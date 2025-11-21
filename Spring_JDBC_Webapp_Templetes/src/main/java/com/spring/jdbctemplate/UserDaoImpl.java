package com.spring.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public void register(User user) {
		
		String sql="insert into user(username,password) values(?,?)";
		jdbcTemplate.update(sql, new Object[]
				{user.getUsername(),user.getPassword()});
		
		
		
	}

}
