package basic;

public class simplecompoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount=50000;
		float r=10.0f;
		int n=5;
		double SI=amount*r*5/100;
		System.out.println("The simple interest is " + (amount+SI));

		float n1=(1.0f+r/100f);
		float n2=1.0f;
		for(int i=0;i<5;i++)
		{
			n2=n2*n1;
		}
		double CI=amount*n2;
		System.out.println("The compound interest is " + (float)CI);


	}

}
