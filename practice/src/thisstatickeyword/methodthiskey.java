package thisstatickeyword;


class a
{
	void m()
	{
		System.out.println("this is m method");
	}
	
	void n()
	{
		m();// method call without using this;
		this.m();
		System.out.println("this is n method");
	}
	 
}
public class methodthiskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a a1=new a();
		a1.n();
		
	}

}
