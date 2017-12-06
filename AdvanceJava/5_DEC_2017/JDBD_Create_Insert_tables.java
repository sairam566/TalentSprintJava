import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBD_Create_Insert_tables {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		String createTable="create table emp2(eid int(3),ename varchar(20),esal float(8,2))";
		String insert1="insert into emp2 values(100,'sairam',66666.03)";
		String insert2="insert into emp2 values(101,'bhargav',62622.05)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c03","root","root");
			
			st=con.createStatement();
			st.executeUpdate(createTable);
			int x=st.executeUpdate(insert1);
			x+=st.executeUpdate(insert2);
			System.out.println(x+" rows updated");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

}
