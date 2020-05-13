package classobject;



class acco {
	 
	 int acc_no;
	 String name;
	 float  amount;
	
	   void insert(int ac,String n,float a)
	   {
		   acc_no=ac;
		   name=n;
		   amount=a;
		   
	   }
	   
	   
	   void  deposit(float a)
	   
	   {
		amount=amount+a;
		System.out.println(a + "deposited");
		
		   
	   }
	   
	   void widrow (float a)
	   
	   {
		   if(amount<a)
		   {
			   System.out.println("not a widrows");
			   
		   }
	   else
	   {
		amount=amount-a;
		System.out.println(a+ "widrowed");
	   }
	  }
	   
	   
	   void  balance()
	   {
		   System.out.println("balance is:"+amount);
	   }
	   
	   void display( ) {
		   
		      System.out.println(acc_no+" "+name +" " +" " +amount);
		      
	   }
	
}
public class bankexmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   acco a1=new acco();
	   a1.insert(12345, "mehul", 1000);
	   a1.display();
	   a1.balance();
	   a1.deposit(20000);
	   a1.balance();
	   a1.widrow(10000);
	   a1.balance();
	   
		

	}

}
