package multitreading;


class  hii extends Thread{
	   public void run() {
		   for (int i=1;i<5;i++) {
			   
		  
		    System.out.println(" hii: " + i); 
		    
		 try {   Thread.sleep(5000); }catch(Exception e) { }
		   }	
		   }  
	    
}


class  hello11  extends Thread{
	   public void run() {
		   for (int i=1;i<5;i++) {
			     
			   System.out.println("hello: "+i); 
		    
			   try {   Thread.sleep(5000); }catch(Exception e) { }
		   }	
		   }  
	    
}

public class ttreadex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hii h=new hii();
		hello11 h1= new  hello11();
		
		h.start();
		h1.start(); 
		 
		

	}

}
