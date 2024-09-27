package com.example.SpringJPAQuery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.SpringJPAQuery.model.Student;
import com.example.SpringJPAQuery.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	public List<Student> getAllStudentDetails()
	{
		return repo.findAll();
	}
	
	public Student getOneStudent(Long id)
	{
		Student st1=null;
		Optional<Student> st=repo.findById(id);
		if(st.isPresent())
		{
			st1=st.get();
			return st1;
		}
		else
		{
			return st1;
		}
			}
public Student saveOneStudent(Student st)
{
	return repo.save(st);
}

public void  deleteAStudentByHisID(Long id)
{
	boolean flag=false;
	repo.deleteById(id);
	
}

public Student updateStudentDetails(Long id,String email)
{
	Student st=null;
	                  Optional<Student>student=  repo.findById(id);
	                  if(student.isPresent())
	                  {
	                	 st=student.get();
	                	  st.setEmailId(email);
	                	  repo.save(st);
	                	  return st;
	                  }
	                  else
	                  {
	                	 return st=null;
	                  }
}

public List<Student>  findWalmartByFirstName(String name)
{
	return repo.findByfirstName(name);
}

public Student  findWalmartByFirstNameAndMail(String name,String mail)
{
	return repo.findByFirstNameAndMail(name, mail);
}
}
