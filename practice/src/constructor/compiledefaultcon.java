package constructor;



class student {
	   int id;
	   String name;
	   
	   void display ()
	   {
		   System.out.println(id +" " +name);
		   
	   }
}

public class compiledefaultcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object
		student s1=new student();
		s1.display();
		

	}

}
