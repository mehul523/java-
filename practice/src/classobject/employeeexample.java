package classobject;

class employee {
	 
	 int id;
	 String name;
	  float  salary;
	  
	  void insert(int i,String n,float s)
	  {
		  id=i;
		  name=n;
		  salary=s;
		  
	  }
	  
	  void display ()
	  {
		  System.out.println("id:"+id);
		  System.out.println("name:"+name);
		  System.out.println("salray:"+salary);
		  
	  }
}

public class employeeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		
		e1.insert(101, "mehul", 12000);
		e2.insert(102,"tony", 14000);
		e3.insert(103, "rahul", 10000);
		
		e1.display();
		e2.display();
		e3.display();
		
		

	}

}
