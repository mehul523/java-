
package polymorphism;


class vihical {
	
	    void run() {
	    	System.out.println("this ois v class");
	    }
	
	
}

class bike extends vihical {
	 void run() {
	    	System.out.println("this is bike class");
	    }
}
public class methodovverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike b11 =new bike();
		b11.run();
	}

}
