package thisstatickeyword;


class st{
	int rol;
	float fees;
	String name;
	
	st(int rol, float fees,String name)
	{
		this.rol=rol;
		this.fees=fees;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(rol+" "+fees+" "+name);
	}
}
public class resovethisvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     st s1=new st(111,50000f,"mehul");
	     st s2=new st(222,40000f,"rahul");
		    
	     s1.display();
	     s2.display();

	}

}
