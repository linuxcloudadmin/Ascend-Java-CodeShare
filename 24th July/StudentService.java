package com.db;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;
public class StudentService {

	public void insertStudentDetails(List<Student> st)
	{
		try {
		Connection con=DbConnection.getConnection();
		String sql="insert into Student values(?,?,?,?)";
		PreparedStatement st1=con.prepareStatement(sql);
		int i=1;
		for(Student s:st)
		{
			int id=s.getSid();
			String name=s.getSname();
			float m=s.getMarks();
			LocalDate d1=s.getDob();
			st1.setInt(1, id);
			st1.setString(2, name);
			st1.setFloat(3, m);
			st1.setDate(4, Date.valueOf(d1));
			i=st1.executeUpdate();
			i++;
			
			
		}
		System.out.println((i+1)+" rows inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public List<Student> getStudentDetails()
	{
		List<Student> st=new ArrayList();
	
		try {
			Connection con=DbConnection.getConnection();
			Statement st1=con.createStatement();
			ResultSet rs=st1.executeQuery("select * from student");
			while(rs.next())
			{
                      int id=rs.getInt(1);
                      String name=rs.getString(2);
                      float marks=rs.getFloat(3);
                      LocalDate d=rs.getDate(4).toLocalDate();
                      
                      Student s=new Student(id,name,marks,d);
                      st.add(s);
			}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return st;
}
}
