package multitreading;

class multi extends Thread  {
	
	     public void run() {
	    	 System.out.println("mehul");
	     }
}

public class exmmpletread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 multi m1= new multi ();
		 //strat  gto call run methods 
		 m1.start();
		 
		 
		     
	}

}
