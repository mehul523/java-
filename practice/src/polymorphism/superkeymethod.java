package polymorphism;

class Ani11{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Ani11{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  

public class superkeymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();  
		d.work(); 
	}

}
