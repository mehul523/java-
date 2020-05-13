package abstraction;


abstract class shape{
	 abstract void draw();
}

 //in programme impliment  is other  class of method

class circle extends shape{
	void draw() {
		System.out.println("circle class runing....");
		
	}
}

class rectangle extends shape{
	 void draw() {
			System.out.println("rectangle  class runnung..."); 
	 }
}
public class shapeabstrction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method call in user
    shape s =new circle ();
    s.draw();
    shape s1=new rectangle();  //cal the  method with upcasting 
    s1.draw();
	}

}
