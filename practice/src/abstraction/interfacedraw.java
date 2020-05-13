package abstraction;


interface drawable {
	 
	   void drow();

}


class circle1 implements drawable {
	 
	  public void drow() {
		     System.out.println("drow circle");
	   }
}


class rec1 implements drawable {
	  public void drow() {
		    System.out.println("drow rectangle");
		  
	  }
}
public class interfacedraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       drawable w=new rec1();
       w.drow();
       
      drawable aw1=new circle1();
      aw1.drow();
	}

}
