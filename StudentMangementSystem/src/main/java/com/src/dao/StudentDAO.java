package com.src.dao;

import java.util.ArrayList;

import com.src.model.Student;
import com.src.model.User;

public interface StudentDAO {
	
	
	
	public int insert(Student s,User u);
	public int edit(Student s);
	public int delete(Student s);
	public ArrayList<Student> getStudents();
	public Student getStudent(int id);
	public boolean validateUser(User u);
	
	

}
