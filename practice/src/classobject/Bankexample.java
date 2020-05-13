package classobject;


class account {	
	  int acc_no;
	  String name;
	  float amount;
	  

	   void insert (int an, String n, float a)
	   {
		   acc_no=an;
		   name=n;
		   amount=a;
		   
	   }
	   
	   void deposit(float a)
	   {
		   amount=amount+a;
		   
		   System.out.println(a+" deposited");
	   }
	   
	   void widrow(float a)
	   {
		   
		   if(amount<a)
		   {
			   System.out.println("not  widrowed");
		   }
		   else
		   {
	         amount =amount-a;
		     System.out.println(a+" widrowed");
		   }
	   }
	   
	  //method to check the balance of the account  
	   void checkBalance(){System.out.println("Balance is: "+amount);}  
	   //method to display the values of an object  
	   void display(){System.out.println(acc_no+" "+name+" "+amount);}  
   }




public class Bankexample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		account a1=new account ();
		a1.insert(832345,"Ankit",1000);
		a1.display();
		
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.widrow(10000);
		a1.checkBalance();
		
	}

}
