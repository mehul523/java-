package thisstatickeyword;

class employee
{
	 int id;
	 String name;
	 String dob;
	 String des;
	 
	employee( int id ,String name,String dob,String des)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.des=des;
		
	}
	
	void display() {
		System.out.println(id+":"+name+":"+dob+":"+des);
	}
	
}


public class clex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e1=new employee(111,"mehul","18/09/1998","manager");
         e1.display();
	}

}
