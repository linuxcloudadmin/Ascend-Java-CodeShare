import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.DBConnection;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
	
		Connection conn=	DBConnection.getConnection();
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		String n=s.next();
		PreparedStatement psmt=conn.prepareStatement("select * from stud  where id=? and sname=?");
		psmt.setInt(1,id);
		psmt.setString(2,n);
		
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		
		

	}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
	}

}
