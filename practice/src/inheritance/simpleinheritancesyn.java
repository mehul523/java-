package inheritance;


class employee {
	 
	   float salarry=10000; 
}

class programmer extends employee{
	 int bonus=10000;
}
public class simpleinheritancesyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		programmer p=new programmer();
		System.out.println(p.salarry);
		System.out.println(p.bonus);	
	}

}
