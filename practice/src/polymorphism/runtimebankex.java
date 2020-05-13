package polymorphism;


class bank20{
	
	float getRateOfInterest(){return 0;} 
}
class sbi12 extends bank20{
	float getRateOfInterest(){return 7;} 
}


class icici extends bank20{
	float getRateOfInterest(){return 9;} 
}

class kotak extends bank20{
	float getRateOfInterest(){return 5;} 
}
public class runtimebankex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		bank20 b;
		b = new sbi12();
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()); 
		
		  b =new icici();
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()); 
		
		 b =new kotak();
			System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
	}

}   
