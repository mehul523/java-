package thisstatickeyword;


class coun
{
	static  int co=0 ; //static vrialble 
  
 coun()
 {
	 co++;
	 System.out.println(co);
}
}


public class count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coun c1=new coun();
		coun c2=new coun();
		coun c3=new coun();
	}

}
