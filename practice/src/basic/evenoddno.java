package basic;

import java.util.Scanner;

public class evenoddno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj =new Scanner(System.in );
	   System.out.println("enter no1:");
	     int a=obj.nextInt();
	     
	   //  System.out.println("enter no2:");
	     //int b=obj.nextInt();
	   
	     if(a%2==0) 
	     {
	    	 System.out.println(a+" is even..");
	    	 
	   	   
	     }
	     else
	     {
	    	 System.out.println(a+" is odd..");
	   	  
	     }
	
	}	

}
