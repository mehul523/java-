package abstraction;


abstract class  bank16{
	
	
	int Acno;
	String AcType;
	String Acname;
	float Opbalance;
	
	abstract void interest(); //ab method declare 
	
	bank16(int Acno,String AcType,String Acname,float Opbalance)   //constractor 
	{	
		this.Acno = Acno;
		this.AcType = AcType;
		this.Acname = Acname;
		this.Opbalance = Opbalance;
	}
}


class SavingsAC extends bank16
{
	SavingsAC(int Acno,String Acname,float Opbalance)
	{
		super(Acno,"Savings",Acname,Opbalance);
	}
	void interest()
	{
		System.out.println("Your interest on Savings A/C is : " + (Opbalance*0.08));
	}
}

class CurrentAC extends bank16
{
	CurrentAC(int Acno,String Acname,float Opbalance)
	{
		super(Acno,"Current",Acname,Opbalance);
	}
	void interest()
	{
		System.out.println("Your interest on Current A/C is : " + (Opbalance*0.06));
	}
}


public class ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bank16 b1 = new SavingsAC(101,"mehul",10000f);
		b1.interest();
		b1=new CurrentAC(108,"mehulbhai",2000f);
		b1.interest();
	}

}
