package multitreading;


	 
public class runabletreadds implements Runnable {
	
	public void run() {
	     try{  System.out.println("this is runnable threads....");}catch(Exception e) {}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runabletreadds m2= new runabletreadds();
		
		Thread t=new Thread(m2);
		   t.start();

	}

}
