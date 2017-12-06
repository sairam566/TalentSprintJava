import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.connection.GetJDBCConnection;

public class JDBC_Search_Record {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		int searchId;
		
		System.out.println("Enter EMP ID to search: ");
		searchId=sc.nextInt();
		
		con=GetJDBCConnection.getConnection();
		try {
			
			st=con.createStatement();
			rs=st.executeQuery("select * from emp2");
			while(rs.next())
			{
				if(rs.getInt(1)==searchId)
				{
					System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"  "+rs.getFloat(3));
				}
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
