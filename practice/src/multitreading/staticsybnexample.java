package multitreading;

class table3 {
	   
	  synchronized static void print(int n) {
		     for(int i=1;i<10;i++) {
		    	
		    	 System.out.println(n*i);;
		    	 
		    	 try {
		    		    Thread.sleep(500);   
		    	 }catch(Exception e) { }
		     }
	   }
	
}


class multi1 extends Thread{
	
	public void run(){
		table3.print(1);
		
	}
	
	
}

class multi2 extends  Thread {
	  public void run() {
		  table3.print(10);
	  }
	
}

class multi3 extends  Thread {
	  public void run() {
		  table3.print(100);
	  }
	
}

class multi4 extends  Thread {
	  public void run() {
		  table3.print(1000);
	  }
	
}


public class staticsybnexample {

	    public static void main(String args[] ) {
	    	
	    	multi1 m=new multi1();
	    	multi2 m2= new multi2();
	    	multi3 t3=new multi3();
	    	multi4 t4= new multi4();
	    	Thread t1=new Thread(m);
	    	Thread t2=new Thread(m2);
	    //	Thread t3=new Thread();
	    	//Thread t4=new Thread();
	    	t1.start();
	    	t2.start();
	    	t3.start();
	    	t4.start();
	    }
}
