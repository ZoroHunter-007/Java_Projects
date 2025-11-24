package com.spring.jdbctemplate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public void register(User user) {
		
		String sql="insert into user(username,password) values(?,?)";
		jdbcTemplate.update(sql, new Object[]
				{user.getUsername(),user.getPassword()});
		
		
		
	}


	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		String sql="select *from user";
		return jdbcTemplate.query(sql, (rs,rowNum)	 -> 
		{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
		
			return u;
		});
	
	}


	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from user where id="+id;
		
		return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> 
		{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			
			return u;
			
		});
	}


	@Override
	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		String sql="update user set username=?, password=? where id=?";
		jdbcTemplate.update(sql,new Object[] {user.getUsername(),user.getPassword(),user.getId()});
		
	}

}
