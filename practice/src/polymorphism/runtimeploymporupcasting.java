package polymorphism;


class bike20 {
	
	  void run()
	  {
		  System.out.println("this is bike class.....");
	  }
}


class honda1 extends bike20{
	 void run()
	  {
		  System.out.println(" running  60 km....");
	  }
	
}


public class runtimeploymporupcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike20 b1=new bike20(); //simple object 
		bike20 b =new honda1();  //upcasting 
		b.run();
		b1.run();

	}

}
