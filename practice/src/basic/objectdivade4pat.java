package basic;



class printSer
{
	void PrintSeries(int j)
	{
		int i;
		double n=j;
		double sum=0.0;
		for(i=0;i<j;i++,n--)
		{
			sum=sum+(1.0/(n*n));
		}
		System.out.println("The sum is : " + sum);
	}
}



public class objectdivade4pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSer p1=new printSer(); //create obj
		
		p1.PrintSeries(3);
		
		
	}

}
