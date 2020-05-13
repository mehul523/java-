package polymorphism;


class Adder {
	
	static int sum(int a,int b){
		  
		 return a+b;
		 
	}
	
	static double sum(double  a,double b)
	{
		  return a+b;
	}
}

public class methodovrloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Adder a =new Adder();
		
		System.out.println("sum:"+a.sum(10, 10));
		System.out.println("sum:"+a.sum(12.5, 12.4));
	
	}

}
