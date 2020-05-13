package inheritance;



class ani{
	void eat() {
	System.out.println("eatting");
	}
}

class dog1 extends ani {
	void bark() {
		System.out.println("barking....\n");

	}
}

class cat extends ani{
	
	void mew() {
		System.out.println("meowing...");

	}
}
public class hierarchicalinheritanceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cat c =new cat();
		dog1 d=new dog1();
		c.mew();
		c.eat();
		
		//c.bark();
       d.bark();
	}

}
