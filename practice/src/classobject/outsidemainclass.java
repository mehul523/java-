package classobject;


class   outside {
	      int id=1;
	      String  name ="mehul";
	      
	
}
public class outsidemainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 outside o1=new outside(); //creating object
		
		 
		 //access the  value 
		 System.out.println(o1.id);
		 System.out.println(o1.name);
		 
	}

}
