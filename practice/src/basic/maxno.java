package basic;

import java.util.Scanner;

public class maxno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj =new Scanner(System.in );
	   System.out.println("enter no1:");
	     int a=obj.nextInt();
	     
	     System.out.println("enter no2:");
	     int b=obj.nextInt();
	   
	     if(a>b) 
	     {
	    	 System.out.println(a+" is max..");
	    	 
	   	   
	     }
	     else
	     {
	    	 System.out.println(b+" is max..");
	   	  
	     }
	     
    
	}

}
