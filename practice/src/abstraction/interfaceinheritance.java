package abstraction;

interface a {
	    void print11();
}

interface b extends a {
	       void show11();
}


class Abc15 implements a,b{
	  
	     public void print11() {
	    	 System.out.println("hello ");
	     }
}
public class interfaceinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Abc15 z= new Abc15();
     z.print11();
	}

}
