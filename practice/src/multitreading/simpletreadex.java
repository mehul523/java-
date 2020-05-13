package multitreading;

class hi17   implements Runnable{
	
	  public  void run() {
		  for( int i=1;i<=5;i++)
		  {
			  System.out.println("hiii");
			  //wait the half secand
		      try {Thread.sleep(1000);}catch(Exception e ) {}						

		  }
	  }
	
}

class hello17 implements Runnable  {
	 public  void run() {
		    for (int i=1;i<=5;i++)
		    {
		    	System.out.println("hello");
		        try {Thread.sleep(1000);}catch(Exception e ) {}						
		    }
		 
	 }
	
	
}


public class simpletreadex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  //  hi obj1 =new hi();
		   // hello obj2=new hello();
		    Runnable obj1=new hi17();
		    Runnable  obj2=new hello17();
		    
		    Thread t1=new Thread(obj1);
		    Thread t2=new Thread(obj2);
		    
		    t1.start();
		  // try {Thread.sleep(1000);}catch(Exception e ) {}	
		   t2.start();
		   
		 //  obj.run();
		 //  obj1.run();
	}

}
