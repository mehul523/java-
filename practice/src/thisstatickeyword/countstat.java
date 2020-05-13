package thisstatickeyword;



class count {
	
	 int cou=0;
	
	 count()
	 {
		 cou++;
		 
		 System.out.println(cou);
	 }
	
}
public class countstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		count c1=new count();
		count c2=new count();
		count c3=new count();
	}

}
