package abstraction;

abstract class bike1{
	
	  //constractor
	     bike1() {
	    	 System.out.println(" bike is created");
	     }
	      //abstract method
	     abstract void  run();
	     
	     
	      //non -abstract method 
	     void change() {
	    	 System.out.println("gear is changed.");
 
	     }
}


class honda1 extends bike1 {
	  void run() {
			 System.out.println("this is running safely...");

	  }
}

public class abclassmethodcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       bike1 b2= new honda1();
       b2.run();
       b2.change();
	}

}
