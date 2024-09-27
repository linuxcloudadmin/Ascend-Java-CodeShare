package com.example.SpringJPAQuery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.SpringJPAQuery.model.Student;
import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	
            public  List<Student> findByfirstName(String name);
            public  List<Student> findByguardianName(String name);
            @Query("select u from Student u where u.firstName=?1 and emailId=?2")
          Student  findByFirstNameAndMail(String name,String mail);
            
            @Modifying
            @Transactional
           @Query("update student s set emailId=?2 where firstName=?1") 
      public  Student     updateStudentByHisFirstName(String name,String email);
/*
public List<Student> findByFirstNameContaining(String name);
@Query("select u from Student u where u.emailId=?1")
public Student findByEmailAddress(String email);*/
@Modifying
@Transactional
@Query(
		value="update student set first_name=?1 where email_id=?2",nativeQuery=true)
public int updateFirstNameBasedOnEmail(String firstName,String emailId);

}
