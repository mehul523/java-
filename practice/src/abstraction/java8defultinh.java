package abstraction;


interface dra {
	
	  void d();
	  
	default   void  p() {
		  System.out.println("hello bhai");
	  }
	  
}


class mehul implements dra{
	
	  public  void d() {
			  System.out.println("hello mehul classs");

	   }
}
public class java8defultinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  dra  m=new  mehul();
		  m.d();
		  m.p();
	}

}
