package basic;

import java.util.Scanner;

public class fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner obj=new Scanner(System.in);
	   System.out.println("enter no:");
	   int no=obj.nextInt();
	   
	//	int no=10;
		int i;
		if(no==1)
		{
			System.out.print("0 ");
		}
		else if(no==2)
		{
			System.out.print("0 1 ");
		}
		else
		{
			System.out.print("0 1 ");
			int a=0;
			int b=1;
			int c;
			i=2;
			while(i<no)
			{
				c=a+b;
				System.out.print(c + " ");
				a=b;
				b=c;
				i++;		
			}
		}


	}

}
