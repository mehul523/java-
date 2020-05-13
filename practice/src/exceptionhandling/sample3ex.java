package exceptionhandling;

public class sample3ex {
     static void avg()
		 {
			   try {
				    throw new  ArithmeticException ("demo");
				  
			   }
			   catch( ArithmeticException e) {
				   System.out.println("exception caught");
			   }
			 
		 }
		
		
public static void main(String[] args) {
	// TODO Auto-generated method stub
  avg();
}

}