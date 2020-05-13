package abstraction;


abstract class  bike {
	 abstract void  run();
}

class honda extends bike{
	
	void run() {
		 System.out.println("runnuing saftly...");
	}
}
public class abstrct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 bike 
		 b =new  honda();
		 b.run();
	}

}
