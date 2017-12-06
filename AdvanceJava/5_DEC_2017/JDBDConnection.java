import java.sql.*;


public class JDBDConnection {

	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c03","root","root");
			if(con!=null)
			{
				System.out.println("Successfull conection");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
