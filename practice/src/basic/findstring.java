package basic;

import java.util.Scanner;

public class findstring {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	
		
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the string:");
	    String s1=obj.nextLine();
	    
	    System.out.println("entr the finding string:");
         String s2=obj.nextLine();
       
	    
		System.out.println("string:"+s1.indexOf(s2));
		
		System.out.println("concate"+s1.concat(s2));
		
		
	}

}
