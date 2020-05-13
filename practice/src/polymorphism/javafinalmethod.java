package polymorphism;


class Bike{  
	  final void run(){System.out.println("running");}  
	} 

class Honda extends Bike{  
	  // void run(){System.out.println("running safely with 100kmph");}  
}

	  
public class javafinalmethod {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Honda honda= new Honda();  
		   honda.run();  
	}

}
