package abstraction;

interface  abc {
	
	  void print();
}


interface def {
	     void show();
}


class A8 implements abc,def{
	 public void print() {
		     System.out.println("helo print");
	 }
	
	 public void  show () {
	     System.out.println("helo show");
 }
	 
}
public class multipleinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A8 a=new A8();
        a.print();
        a.show();
	}

}
