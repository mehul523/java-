import java.sql.*;
import java.io.*;


public class retriveimage {

	public static void main(String[] args)  throws Exception  {
		// TODO Auto-generated method stub

		 String url="jdbc:mysql://localhost:3306/mehul";
         String uname="root";
          String pass="root";
        String query ="select * from img";
        
		 //steps -->
         
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection conn=DriverManager.getConnection(url, uname, pass);
	   
        PreparedStatement st=conn.prepareStatement(query);
		
	    ResultSet rs= st.executeQuery();
	    
	    
	     if(rs.next()) {
	    	 
           Blob b= rs.getBlob(2);
           byte barr[]=b.getBytes(1,(int)b.length());//it means first image 
           
           FileOutputStream fout=new FileOutputStream("E://mehul.jpg");  
           fout.write(barr);  
                         
           fout.close();  
	     }
	     System.out.println("ok"); 
	     
	     conn.close();  
	}

}
