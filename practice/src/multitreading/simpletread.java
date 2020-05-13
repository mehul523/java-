package multitreading;

class hi  extends Thread{
	
	  public  void run() {
		  for( int i=1;i<=5;i++)
		  {
			  System.out.println("hiii");
			  //wait the half secand
		      try {Thread.sleep(1000);}catch(Exception e ) {}						

		  }
	  }
	
}
class hello extends Thread {
	 public  void run() {
		    for (int i=1;i<=5;i++)
		    {
		    	System.out.println("hello");
		        try {Thread.sleep(1000);}catch(Exception e ) {}						
		    }
		 
	 }
	
	
}
public class simpletread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	   hi obj =new hi();
	   
	   hello obj1=new hello();
	   obj.start();
	   
	   try {Thread.sleep(1000);}catch(Exception e ) {}	
	   obj1.start();
	   
	 //  obj.run();
	 //  obj1.run();
	}

}
