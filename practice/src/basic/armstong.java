package basic;

import java.util.Scanner;

public class armstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj=new Scanner(System.in);
		  
	     System.out.println("enter no");
	      int no=obj.nextInt();
	      
		//int no=153;
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
