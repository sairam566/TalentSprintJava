import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.connection.GetJDBCConnection;



public class JDBC_Prepare_statement {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		Scanner sc=new Scanner(System.in);
		int id,updatedRows;
		String choice,name;
		double salary;
		con=GetJDBCConnection.getConnection();
		try {
			pst=con.prepareStatement("insert into emp2 values(?,?,?)");
			do {
				System.out.println("Enter EMP Id: ");
				id=sc.nextInt();
				pst.setInt(1,id);
				System.out.println("Enter EMP Name: ");
				name=sc.next();
				pst.setString(2,name);
				System.out.println("Enter EMP SALARY: ");
				salary=sc.nextDouble();
				pst.setDouble(3,salary);
				updatedRows=pst.executeUpdate();
				System.out.println(updatedRows+"rows updated");
				System.out.println("Do you wish to Continue(Y?N)");
				choice=sc.next();
			} while (choice.equalsIgnoreCase("y"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
