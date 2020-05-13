package polymorphism;

class An{  
void eat(){System.out.println("eating...");}  
}  
class Dog25 extends An{  
void eat(){System.out.println("eating bread...");}  
}  
class Cat extends An{  
void eat(){System.out.println("eating rat...");}  
}  
class Lion extends An{  
void eat(){System.out.println("eating meat...");}  
}  

public class Animal {
	public static void main(String[] args){  
		An a;  
		a=new Dog25();  
		a.eat();  
		a=new Cat();  
		a.eat();  
		a=new Lion();  
		a.eat();  
		}
	

}


