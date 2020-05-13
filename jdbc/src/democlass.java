import java.sql.*;



/*
 *   1 import package
 *   2 lod and register d
 *   3 create connection
 *   4 create  statement
 *   5  excecute query 
 *   6 process of ecution 
 *    7 close conn
 * 
 * 
 */


public class democlass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
           String url="jdbc:mysql://localhost:3306/mehul";
           String uname="root";
            String pass="root";
          String query ="select name from  student where  userid<3";
          
 
            
	     //  Class.forName("com.mysql.jdbc.Driver");
		  
	       Connection conn =DriverManager.getConnection(url, uname, pass);
		
		  Statement  st=conn.createStatement();
		 
		  ResultSet rs=st.executeQuery(query);
		  
		  String a="";
		  while(rs.next())
		   {
		  
		  String name =rs.getString("name");
		 System.out.println(name);
		  
		  
			
		   }
		  st.close();
		  conn.close();
		  	}

}
