package multitreading;

class hi13  extends Thread{
	
	  public  void run() {
		  for( int i=1;i<=5;i++)
		  {
			  System.out.println("hiii : "+ i);
			  //wait the half secand
		      try {Thread.sleep(500);}catch(Exception e ) {}						

		  }
	  }
	
}
class hello13 extends Thread {
	 public  void run() {
		    for (int i=1;i<=5;i++)
		    {
		    	System.out.println("hello :"+i);
		        try {Thread.sleep(500);}catch(Exception e ) {}						
		    }
		 
	 }
	
	
}

public class notrunparelly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 hi13 h1=new hi13();
		 hello13 h2=new hello13();
        h1.run();
        h2.run();

	}

}
