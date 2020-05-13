package thisstatickeyword;


class emp 
{
	  int eid;
	  String  name;
	 // String ceo;
	  static String ceo="mukesh";
	 
	  
	  emp(int i ,String n) //String c)
	  {
		eid=i;
		name=n;
		//ceo=c;
	  }
	  
	  void display()
	  {
		  System.out.println(eid+ " :"+name+" :" +ceo);
	  }
	 
		  
	  
}




public class varistat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  emp mehul =new emp(111,"rahul");
		    
		  
		  //change static var data
		  emp.ceo="abvcd ";
		  emp rahul =new emp(222,"abc");
		   mehul.display();
		   rahul.display();
		  
		  
		  
	}

}
