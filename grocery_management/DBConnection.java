package grocery_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
		private static final String url="jdbc:mysql://localhost:3306/grocery_db";
		private  static final String uname="root";
		private static final String password="Poornima@89";
		
		public static Connection getConnection() {
			Connection conn=null;
			try {
				//step 1: Load Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				// step2: Create Connection
				conn=DriverManager.getConnection(url,uname,password);
				System.out.println("Connection to Database ");
				
			}
			catch(ClassNotFoundException e) {
				System.out.println("Driver not found");
				e.printStackTrace();
			}
			catch(SQLException e) {
				System.out.println("Connection failed");
				e.printStackTrace();
			}
			return conn;
		}
		
}
