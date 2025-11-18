package com.Curses;

public class Courses {

	private int course_id;
	private String courseName;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", courseName=" + courseName + "]";
	}
	
	
}
