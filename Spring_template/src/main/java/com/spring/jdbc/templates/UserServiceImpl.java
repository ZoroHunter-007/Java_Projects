package com.spring.jdbc.templates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public void InsertData(Student stud) {
		// TODO Auto-generated method stub
		userDao.InsertData(stud);
		
	}
	@Override
	public List<Student> showAllData() {
		// TODO Auto-generated method stub
		return userDao.showAllData();
	}
	@Override
	public Student StudentById(int id) {
		// TODO Auto-generated method stub
		return userDao.StudentById(id);
	}
	@Override
	public void UpdateData(Student stud) {
		// TODO Auto-generated method stub
		userDao.UpdateData(stud);
		
	}
	@Override
	public void DeleteData(int id) {
		// TODO Auto-generated method stub
		userDao.DeleteData(id);
		
	}

}
