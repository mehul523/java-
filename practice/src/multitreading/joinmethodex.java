package multitreading;

class hi14  extends Thread{
	
	  public  void run() {
		  for( int i=1;i<=5;i++)
		  {
			  System.out.println("hiii : "+ i);
			  //wait the half secand
		      try {Thread.sleep(500);}catch(Exception e ) {}						

		  }
	  }
	
}
class hello14 extends Thread {
	 public  void run() {
		    for (int i=1;i<=5;i++)
		    {
		    	System.out.println("hello :"+i);
		        try {Thread.sleep(500);}catch(Exception e ) {}						
		    }
		 
	 }
	
	
}

public class joinmethodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 hi14 h1=new hi14();
		 hello14 h2=new hello14();
        h1.start();
       //   join 
          try {
         h1.join();
        }catch(Exception e) { }
        h2.start();
	}

}
