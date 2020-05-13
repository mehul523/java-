package basic;

import java.util.Scanner;

public class circletrianglesquareamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area;
		Scanner obj =new Scanner (System.in);
		 System.out.println("enter choise \n 1.circle \n 2.squre \n 3.tringle\n");
		 int a=obj.nextInt();
		//int a=1;
		switch(a)
		{
			case 1:	double PI=3.24,r=10;
				area=2*PI*r*r;
				System.out.println("Area of circle is " + area);
				break;
			case 2:	double l=10,b=10;
				area=l*b;
				System.out.println("Area of rectangle is " + area);
				break;
			case 3:	double ba=10,a1=10;
				area=(1/2)*(ba*a1);
				System.out.println("Area of triangle is " + area);
				break;
			default:System.out.println("Wrong choice");
		}
	

	}

}
