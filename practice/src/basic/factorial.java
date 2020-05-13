package basic;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int i;
	
		Scanner myobj =new Scanner(System.in);
		System.out.println("Enter no:");
		int no=myobj.nextInt();
		
		for(i=1;i<=no;i++)
		{
			 fact=fact*i;
		}
		System.out.println("fact:"+fact);
		}

	}

