package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue
	private int stud_id;
	
	@Column
	private String stud_name;
	
	@Column
	private int stud_rno;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="stud_course",
	joinColumns = @JoinColumn(name="stud_id"), inverseJoinColumns = @JoinColumn(name="course_id"))
	private List<Course>courses;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getStud_rno() {
		return stud_rno;
	}
	public void setStud_rno(int stud_rno) {
		this.stud_rno = stud_rno;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
