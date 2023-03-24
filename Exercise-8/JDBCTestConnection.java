import java.sql.*;

class JDBCConnectivity {
	Connection con;
	Statement stmt;
	ResultSet rs;

	JDBCConnectivity() {
		try{
			/*
			 * Connection with sql-employee_details database)
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost/employee_Details","root","Sujitha@2002");
			
			stmt = con.createStatement();
			/*
			 *Trying to insert in existing emp table which is available in employee_details database 
			 */
			int result=stmt.executeUpdate("insert into emp(empid,empname,role) values(110,'bie','manager');");
			rs = stmt.executeQuery("select * from emp;");
			if(result>0) {
				 System.out.println("successfully inserted");
			}
			else {
				 System.out.println("unsuccessfully inserted");
			}
			
			System.out.println("\nTable Details...");
			/*
			 *Displaying the values in emp table 
			 */
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
			}
		}
		catch(Exception e) {}
		
		}
}

class JDBCTestConnection {
	public static void main(String args[]) {
		new JDBCConnectivity();
	}
}