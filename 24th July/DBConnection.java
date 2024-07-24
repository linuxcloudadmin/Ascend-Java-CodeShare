import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection  getConnection()
	{
		Connection conn=null;
	
		try {
	
	Class.forName("org.postgresql.Driver");
	String dbURL = "jdbc:postgresql://localhost/walmartb2";
	String user = "postgres";
	String pass = "Shreemb2004r";
	 conn= DriverManager.getConnection(dbURL, user, pass);
}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}}
