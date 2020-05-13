package constructor;


class student7 {
	
        int id;
        String name;
        
	
        student7(int i,String n)
        	{
        	id=i;
            name=n;
         	}
        
        student7(student7 s)
        {
        	id=s.id;
        	name=s.name;
        }
        
        void display() {
        	System.out.println(id+" " +name);
        }
}

public class copyconstroctorobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		student7 s1=new student7(111, "mehul");
		student7 s2=new student7(s1);
		s1.display();
		s2.display();

	}

}
