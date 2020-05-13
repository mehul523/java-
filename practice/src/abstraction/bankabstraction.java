package abstraction;


abstract class bank {
	
	  abstract int interest();
}

class sbi extends  bank{
	
	   int interest()
	    {
	    	return 7 ;
	    }
}

class pnb extends bank{
	  int interest() {
		   return 9;
	  }
}

public class bankabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	bank b;
	b=new pnb();
	 System.out.println("rate is:"+b.interest());
	 b=new sbi();
	 System.out.println("rate is:"+b.interest());

	 
	}

}
