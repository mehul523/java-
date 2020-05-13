package abstraction;



interface  printable {
	
     void run();
     
}


class abc6 implements printable{
	
	 public void run() {
		  System.out.println("this isn run...");
	  }
	
}
public class exinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            printable p=new abc6();
            p.run();
	}

}
