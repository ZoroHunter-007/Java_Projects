package com.spring.jdbc.templates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void InsertData(Student stud) {
		// TODO Auto-generated method stub
		String sql="insert into student(stud_name,stud_pass) values(?,?)";
		jdbcTemplate.update(sql,new Object[]
				{stud.getStud_name(),stud.getStud_pass()} );
		
	}

	@Override
	public List<Student> showAllData() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		return jdbcTemplate.query(sql,(rs, rowNum) ->
		{
			Student stud=new Student();
			stud.setStud_id(rs.getInt("stud_id"));
			stud.setStud_name(rs.getString("stud_name"));
			stud.setStud_pass(rs.getString("stud_pass"));
			
			return stud;	
		
		});
		
	}

}
