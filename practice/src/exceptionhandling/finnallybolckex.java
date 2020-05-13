package exceptionhandling;

public class finnallybolckex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  try {
			  int data=25/5;  
			   System.out.println(data);    
			  
		  }
		  catch(NullPointerException e) {
			  System.out.println("this is catch block");
		  
   			  
		  }
		  
		  finally {
			  System.out.println("mehulbhai is a nick nname is  a pitter");
		  }
	}

}
