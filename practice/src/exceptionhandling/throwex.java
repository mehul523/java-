package exceptionhandling;

public class throwex {

	    static void run(int age) {
	    	 if(age<18)
	    	 {
	    		  throw new ArithmeticException("not valid");
	    		  
	    	 }
	    	 else {
	    		  
	    		      System.out.println("welcome to vote");  
	    		 
	    	 }
	    	
	    	
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            run(16);
            System.out.println("rest of the code...");  
		
		
	}

}
