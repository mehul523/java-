package multitreading;

class hi20 implements Runnable{
	
	  public  void run() {
		  for( int i=1;i<=5;i++)
		  {
			  System.out.println("hiii");
			  //wait the half secand
		      try {Thread.sleep(1000);}catch(Exception e ) {}						

		  }
	  }
	
}

class hello20 implements Runnable {
	 public  void run() {
		    for (int i=1;i<=5;i++)
		    {
		    	System.out.println("hello");
		        try {Thread.sleep(1000);}catch(Exception e ) {}						
		    }
		 
	          }	
	}



public class multitreadingex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  //  hi obj1 =new hi();
		   // hello obj2=new hello();
		    
		Runnable obj1=new hi20();
		    Runnable  obj2=new hello20();
		    
		    Thread t1=new Thread(obj1);
		    Thread t2=new Thread(obj2);
		    
		    t1.start();
		  // try {Thread.sleep(1000);}catch(Exception e ) {}	
		   t2.start();
		   
		 //  obj.run();
		 //  obj1.run();
	}                 

}                                           
