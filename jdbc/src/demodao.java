import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;
import java.sql.*;

class student  {
	
	   int rollno;
	   String sname;
	   
}



class studentdao {
	
	    public student getstudent (int rollno) {
	    	  
	    	 try {
	    		 String query ="select sname from student1 where rollno= " +rollno;
	    	
	        student s=new student();  //object student class 
	         s.rollno =rollno;
	        
	        //Class.forName("com.mysql.jdbc.Driver");
	        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mehul", "root", "root");
	        Statement st =conn.createStatement();
	        ResultSet rs= st.executeQuery(query);
	           
	             rs.next();
	       
	           String name= rs.getString(1);
	           s.sname =name;
	           
	         return s;
	         
	    	 }catch(Exception  ex) {
	    		  System.out.println(ex);
	    	 }
	    	 
	    	 return null;
	    }
}


public class demodao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      studentdao dao = new studentdao();
		  student  s1= dao.getstudent(11);
		  
		  System.out.println(s1.sname);
	}

}



