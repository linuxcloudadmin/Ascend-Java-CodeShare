import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.DBConnection;

public class PreparedStatementDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
	
		Connection conn=	DBConnection.getConnection();
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		String n=s.next();
		//PreparedStatement psmt=conn.prepareStatement("select * from stud  where id=? and  sname=?");
		PreparedStatement psmt=conn.prepareStatement("update stud set sname=? where id=?");
		psmt.setString(1,n);
		psmt.setInt(2,id);
		
		
		int rs=psmt.executeUpdate();
		
		if(rs>0)
		{
			System.out.println("row updated");
		}

	}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
	}

}
