package omixconcept;

class student18  implements Cloneable{
	 
	int rollno;
	String name;
	  student18 (int rollno,String name) 
	  {
		  this.rollno=rollno;
		  this.name=name;
		  
	  }

	  public Object clone()throws CloneNotSupportedException{  
		  return super.clone();  
		  }  
	  
}
public class cloningobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println();//new lin

		try {
			
		
		student18 s1=new student18(101,"amit");  
		  
		student18 s2=(student18)s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		}catch(CloneNotSupportedException c){}
	}

}
