package basic;
import java.util.*;

public class powerno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int power=1;
		//int i=5;
		int j;
	
		Scanner myobj =new Scanner(System.in);
		System.out.println("Enter no:");
		int no=myobj.nextInt();
		
		for(j=1;j<=no;j++)
		{
			 power=power*no;
		}
		System.out.println("power:"+power);
		}

	}

