package polymorphism;


class emp11{
	
	int id;
	String name;
	emp11(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

class per extends emp11{
	
	  float salary;
	  per(int id,String name,float salary)
	  {
		   super(id,name); //reuse con
		this.salary=salary;
	  }
	
	  
	  void display(){System.out.println(id+" "+name+" "+salary);}  
}  


public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		per e1=new per(1,"mehul",45000f);
		e1.display();
	}

}
