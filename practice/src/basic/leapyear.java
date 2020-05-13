package basic;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner obj =new Scanner(System.in );
		   System.out.println("enter year :");
		     int a=obj.nextInt();
		     
		  
		   
		     if(a%4==0) 
		     {
		    	 System.out.println(a+" is leap year..");
		    	 
		   	   
		     }
		     else
		     {
		    	 System.out.println(a+" is not leap year..");
		   	  
		     }
	}

}
