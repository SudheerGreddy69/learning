package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) {
try{
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection( 
		"jdbc:mysql://localhost:3306/sample","root","root");  
		
		//insert operation::
		
      	Statement stmt=con.createStatement();  
//		stmt.executeUpdate("insert into emp values(33,'Sam',23)");  
//		
		
		
		//update opeation :
	//	int result=stmt.executeUpdate("update emp set name='Vimal' where id=33");  
		
      	int result=stmt.executeUpdate("delete from emp where id=33");  
		
		//delete operation ::
		
		
		
		//select operation::
		
		Statement stmt1=con.createStatement();  
		ResultSet rs=stmt1.executeQuery("select * from emp");  
		while(rs.next())  
		{
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
		}
		
		
		
		
		
		
		
		
		con.close(); 
		
}
catch(Exception e)
{
	
}
		
		
	}

}
