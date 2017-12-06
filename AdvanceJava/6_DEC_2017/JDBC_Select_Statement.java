import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.connection.GetJDBCConnection;
public class JDBC_Select_Statement {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String Queary="select * from emp2";
		con=GetJDBCConnection.getConnection();
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(Queary);
			System.out.println("EmpID   Name   Salary");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"  "+rs.getFloat(3));
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
}
