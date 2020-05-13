package thisstatickeyword;



class ab
{
	ab()
	{
		System.out.println("this is ab class");
		
	}
	ab(int x){
		this();
		 System.out.println(x);
	}
	
}
public class defttoperaconthis {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		ab a=new ab(5);

	}

}
