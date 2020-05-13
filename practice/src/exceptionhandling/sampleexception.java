package exceptionhandling;

public class sampleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str =null;
		  //System.out.println(str.length());
		      try { 
		  int a=30 , b=0;
		 int  c= a/b;
		  System.out.println(c);
		      }catch(ArithmeticException e) {
		    	    System.out.println("acception is accure");
		      }
		      
		  
	}

}
