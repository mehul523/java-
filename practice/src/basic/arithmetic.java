package basic;

import java.util.Scanner;

import java.util.*;

public class arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
         System.out.println("enter no1:");
          int no1 =obj.nextInt();
          
          System.out.println("enter no2:");
          int no2 =obj.nextInt();
          
          int c=no1+no2;
          int d=no1-no2;
          int e=no1*no2;
          int f=no1/no2;
          
          System.out.println("add"+c);
          System.out.println("sub"+d);
          System.out.println("multi"+e);
          System.out.println("div"+f);
          
         }

}
