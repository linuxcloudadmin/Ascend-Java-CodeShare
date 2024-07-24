import java.sql.*;

public class Main {

	public static void main(String[] args) {
		try {
	Class.forName("org.postgresql.Driver");
	String dbURL = "jdbc:postgresql://localhost/walmartb2";
	String user = "postgres";
	String pass = "Shreemb2004r";
	Connection conn = DriverManager.getConnection(dbURL, user, pass);
//	Class.forName("com.mysql.cj.jdbc.Driver");
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmartb2", "root", "Shreemb2004r");
			
		Statement st=conn.createStatement();
		String str="update person set pname='jjj' where id=10";
		int i=st.executeUpdate(str);
		if(i>0)
		{
			System.out.println("table is updated");
		}
		
		
		

	}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
	}
}
