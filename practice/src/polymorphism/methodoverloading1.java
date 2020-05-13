package polymorphism;

class Add {
	
	 static int sum(int a, int b)
	  {
         		return a+b;  
	  }
	 
	 static int sum(int a, int b ,int c) {
		 
	 
	      return a+b+c;
	 }
}

public class methodoverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Add a =new Add();
		   System.out.println("sum:"+a.sum(10, 20));
		   System.out.println("sum:"+a.sum(10, 20, 30));
		   
	}

}
