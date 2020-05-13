package constructor;


class student6 {
	
	   int id;
	    String name;
	    
	    student6(int i,String n)
	    {
	    	id=i;
	    	name=n;
	    	
	    }
	    student6() { }
	    
	    void display() {
        	System.out.println(id+" " +name);
        }
}

public class copywithoutcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		student6 s1=new student6(1111, "mehulbhai");
		student6 s2=new student6();
		s2.id=s1.id;
		s2.name=s1.name;
		
		s1.display();
		s2.display();
		
		

	}

}












