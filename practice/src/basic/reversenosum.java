package basic;

import java.util.*;
public class reversenosum {

	public static void main(String[] args) {
		int rev=0;
		int sum=0;
		
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner (System.in);
		   System.out.println("enter no:");
		  int no = obj.nextInt();
		  
		  while (no>0)
		  {
			  rev=(rev*10)+(no%10);
			  sum=sum+(no%10);
			  no=no/10;
			  
		  }
		   System.out.println("rev"+rev);

		   System.out.println("sum"+sum);
	}

}
