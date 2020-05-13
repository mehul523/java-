package basic;


class prime{
	      void primecheck(int a)
	      {
	    	  int j=1;
	  		int flag=0;
	  		while(j<=a)
			{
				if(a%j==0)
				{
					flag++;
				}
				j++;
			}
	  		if(flag==2)
			{
				System.out.println("The number is prime number");
			}
			else
			{
				System.out.println("The number is not a prime number");
			}
	      }
}


public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime p1=new prime();//create object
		p1.primecheck(123);  //access method
	}

}
