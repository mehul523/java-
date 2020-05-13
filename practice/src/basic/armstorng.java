package basic;

class armg {
	
	   void armgcheck(int no)
	   {
		   
		   int sum=0;
			int digit;
			int n1=no;
			while(no>0)
			{
				digit=no%10;
				sum=sum+(digit*digit*digit);
				no=no/10;	
			}
			if(n1==sum)
			{		
				System.out.println("The number is Armstrong");
			}
			else
			{
				System.out.println("The number is not Armstrong");
			}

	   }
	
}




public class armstorng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		armg a1=new armg(); //create object 
		
		a1.armgcheck(10);// access method

	}

}
