package thisstatickeyword;


class mychain{
	
	
	 mychain()
	{
	   System.out.println("default constructor called");
	}
	 
	 mychain(int i,int j)
	 {
	 System.out.println (" Parameterized constructor called");
	 }
	
	 mychain(int i)
	 {
	 
	System.out.println ("one parameterized constructor");
	 }
}

public class ex34cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mychain m=new mychain();
		
		mychain m1=new mychain(10,12);
		mychain m2=new mychain(11);

	}

}
