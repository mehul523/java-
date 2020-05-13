package thisstatickeyword;

class stu{
	   int id;
	   String name;
	   
	  static String clg="ks";
	  
	  
	  static void  change()
	  {
		   stu.clg="abc";
	  }
	  
	  stu(int i,String n){
		  id=i;
		  name=n;
		System.out.println(id+" "+name+" "+clg);
	  }
	
	  
}

public class statmetjhod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//change s v
		
		stu.change();
		
		stu s1 =new stu(111,"mehul");
		stu s2 =new stu(122,"tony");
		stu s3 =new stu(222,"cap");

	}

}
