package com.example.SpringJPAQuery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJPAQuery.model.Student;
import com.example.SpringJPAQuery.service.StudentService;

@RestController
public class StudentController
{
	@Autowired
	StudentService service;
	
	@GetMapping("/listAllStudents")
	public List<Student>  retreiveStudent()
	{
		return service.getAllStudentDetails();
	}
	@GetMapping("/getOneStudentDetail/{id}")
	
		public Student  getStudent(@PathVariable("id") Long id )
		{
		return service.getOneStudent(id);	
		}
	
@PostMapping("/saveStudent")
public Student SaveOneStudent(@RequestBody Student st)
{
	
	return service.saveOneStudent(st);
	
}

@DeleteMapping("/deleteStudent/{id}")
public void  deleteStudentById(@PathVariable("id") Long id )
{
	  service.deleteAStudentByHisID(id);
}
@PutMapping("/updateStudent/{id}/{mail}")

public Student updateStudent(@PathVariable("id") Long id,@PathVariable("mail") String emailId)
{
	return service.updateStudentDetails(id,emailId);
	
	
}

@GetMapping("/findByFirstName/{name}")

	
public List<Student> findWalmartStudentsByFirstName(@PathVariable("name") String name)
{
	List<Student> st= service.findWalmartByFirstName(name);
	return st;


}

@GetMapping("/findByFirstNameandMail/{name}/{mail}")


public Student findWalmartStudentsByFirstNameAndMail(@PathVariable("name") String name,@PathVariable("mail") String mail)
{
	Student st= service.findWalmartByFirstNameAndMail(name,mail);
	return st;


}
}