package inheritance;


class animal1 {
	
	 void eat() {
		 System.out.println("eatting.....");
	 }
	}

class dogi extends animal1 {
	
	void bark() {
		System.out.println("barking.....");
	}
	
}

class babydog extends dogi{
	
	void weep() {
		System.out.println("weeping.....");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		babydog b =new babydog();
		b.eat();
		b.bark();
		b.weep();
	}

}
