package com.example.SpringJPAQuery;

import java.math.BigInteger;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.SpringJPAQuery.model.Student;
import com.example.SpringJPAQuery.repo.StudentRepository;

//@SpringBootApplication

@SpringBootApplication
/*@EnableConfigurationProperties
@ComponentScan(basePackages={"com.model","com.repository"})
@EntityScan(basePackages = {"com.model"})
@EnableJpaRepositories("com.repository")
*/
public class SpringJpaQueryApplication implements CommandLineRunner
{
	@Autowired
private StudentRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//Laptop1 l=new Laptop1();
//		
//		l.setLaptopId(BigInteger.valueOf(13L));
//		l.setBrandName("Lenovo11");
//		l.setDesc(" 161 GB RAM");
//		Person1 p=new Person1();
//		p.setPersonId(BigInteger.valueOf(1300L));
//		p.setFirstName("John12");
//		p.setAddress("Delhi1");
//			p.setL(l);
	//personrepo1.save(p);
//		Student st=new Student();
//		st.setFirstName("bahgya");
//		st.setLastName("shree");
//		st.setGuardianName("babs");
//		st.setEmailId("bags@gmail.com");
//		repo.save(st);
	//java.util.List<Student> st3=	repo.findByfirstName("bahgya");
//System.out.println(st3);
//	java.util.List<Student> st2=repo.findByFirstNameContaining("ak");
//	System.out.println(st2);
	//Student st4=	repo.findByEmailAddress("bags@gmail.com");
//	System.out.println(st4);	
//	int x=repo.updateFirstNameBasedOnEmail("shree", "bags@gmail.com");
//	System.out.println(x+"rows updated");
	}

}
