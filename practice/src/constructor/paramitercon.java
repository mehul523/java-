package constructor;


class student4 {
	
	    int id;
	    String name;
	    
	    //create pera constractor
	    
	   student4(int i,String n)
	   {
		    id=i;
		    name=n;
		    
	   }
	   
	   void display()
	   {
		   System.out.println(id +" " + name);
	   }
	
}
public class paramitercon {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		//object
		
		student4 s1 =new student4(111,"mehul");
		student4 s2=new student4(222,"rahul");
		
		s1.display();
		s2.display();
	
	}

}
