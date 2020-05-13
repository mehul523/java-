package exceptionhandling;

public class sampleex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //number exception ex
		try {
		   int num =Integer.parseInt("mehul");
		   System.out.println(num);
            }catch(NumberFormatException e)
            {
            	   System.out.println("exception of codes...");
            }
           //arrary indexbound of exception
	       try {  
		int a[]=new int[5];
	       a[7]=10;
	       }catch(ArrayIndexOutOfBoundsException e)  {
	    	   
	    	   System.out.println("exception of arrary");
	       }
	       
	       finally {
	    	   
	    	     System.out.println("mehulnbhai");
	       }
	   
	}

}
