package constructor;


class student5{
	 int id;
	 String name;
	 int age;
	 
	 //two perameters
	 
	 student5 (int i, String n)
	 {
		id= i;
		name=n;
		
		 
	 }
	 
	 //threee perameeeters 
	 
	 student5(int i,String n,int a)
	 {
		 
		 id=i;
		 name=n;
		 age=a;
	 }
	 
	 void display() {																											
		 System.out.println(id+  " "+name+" "+age);
	 }
}

public class overloadconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student5 s1=new student5(123, "mehul");
		student5 s2=new student5(567, "tony",20);
		s1.display();
		s2.display();
		
		

	}

}
