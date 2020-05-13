package thisstatickeyword;

class StaticClass
{
	static class InnerClass
	{
		static void staticMethod()
		{
			System.out.println("This is static method of inner class");
		}
	}
}

public class staticclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.InnerClass.staticMethod();
	
	}

}
