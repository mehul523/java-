package omixconcept;



public class wapperclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i=5;//primariy datatype
		  
		  Integer ii=new Integer(i); //wrapperclass;
		  
		  int j=ii.intValue();//unboxing
		  
		  Integer k=i;  //utoboxing
		  int k1=k;
		  System.out.println(k1);
		  
		 // parseint demo
		  
		  String mehul="123";
		  
		  int n= Integer.parseInt(mehul);
		  System.out.println(n );
	}

}
