import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertimg {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		 String url="jdbc:mysql://localhost:3306/mehul";
         String uname="root";
          String pass="root";
        String query ="insert into img  values (?,?)";
        
        
          //Class.forName("com.mysql.jdbc.Driver");
        
        Connection conn=DriverManager.getConnection(url, uname, pass);
	   
        PreparedStatement st=conn.prepareStatement(query);
	  //  ResultSet rs=st.executeQuery(query);
	    
        st.setString(1, "mehul11");
	   
	   
	   FileInputStream  fin =new FileInputStream("C:\\Users\\mehul\\Pictures\\Camera Roll\\mehul1.jpg");
	   st.setBinaryStream(2,fin,fin.available());
	   int i=st.executeUpdate();  
	  
	   System.out.println(i+" records affected");  

	   // st.close();
	    conn.close();

        
	}

}
