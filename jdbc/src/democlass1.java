
import java.sql.*;

public class democlass1 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
    
		    String url ="jdbc:mysql://localhost:3306/mehul";
		    String uname="root";
		   String pass="root";
		   String query="select * from  student";
          
		   //Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection(url, uname, pass);
		    Statement st=conn.createStatement();
		    ResultSet rs=st.executeQuery(query);
		    
		    String a="";
		   
		    while(rs.next())
		    {
		       	a=rs.getInt(1) + " : " +rs.getString(2);
		    	System.out.println(a);
		       	
		    }
		    st.close();
		    conn.close();
	}

}
