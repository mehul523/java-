package polymorphism;

class Animal11{  
Animal11(){System.out.println("animal is created");}  
} 


class Dogu extends Animal{  
Dogu(){  
super();  
System.out.println("dog is created");  
}  
}  

public class supercon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogu d=new Dogu();

	}
}

