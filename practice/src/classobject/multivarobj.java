package classobject;


class studen {
	 int id;
	 String name;
}

public class multivarobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crate object
		
		studen s1=new studen();
		student s2=new student();
		
		
		s1.id=102;
		s1.name="mehul";
		s2.id=103;
		s2.name="rahul";
		
		System.out.println(s1.id+" "+s1.name+ "\n "+s2.id+ " " +s2.name);
		

	}

}
