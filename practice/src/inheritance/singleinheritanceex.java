package inheritance;

class animal {
	
	    void eat()
	    {
	    	System.out.println("this is animal .......");
	    }
}


class dog extends animal{
	
	 void brak() {
		 
		 System.out.println("this ios dog classs inhrerited animal ");
	 }
	
}
public class singleinheritanceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  dog d=new dog();
		  d.eat();
		  d.brak();
	}

}
