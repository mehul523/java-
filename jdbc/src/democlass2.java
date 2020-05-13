import java.sql.*;



public class democlass2 {

	public static void main(String[] args) throws Exception  {

		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/mehul";
	     String  uname="root";
		 String  pass="root";
		 int userid=11;
		 String  name="cap";
         String query="insert  into student values (?,?)" ;
         
         
		      Class.forName("com.mysql.jdbc.Driver");
		      Connection conn=DriverManager.getConnection(url, uname, pass);
		      PreparedStatement  st=  conn.prepareStatement(query);
		      
		          st.setInt(1,userid);
		         st.setString(2, name);
		         int count =st.executeUpdate();
		      
		         
		           System.out.println(count + "rows effect");
		    
		
		    
		    
		    
	}

}
