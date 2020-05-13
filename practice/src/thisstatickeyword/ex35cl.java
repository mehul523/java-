package thisstatickeyword;

class Box
{
	int l,b,h;
	public Box()
	{
		l=0;
		b=0;
		h=0;
	}
	public Box(int n)
	{
		l=b=h=n;
	
	}
	public Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	int volume()
	{
		return(l*b*h);
	}
}
public class ex35cl {

	public static void main(String[] args) {
  
		  // TODO Auto-generated method stub


		Box b1=new Box();
		Box b2=new Box(10);
		Box b3=new Box(10,5,8);
		System.out.println("NO parameter volume :" + b1.volume());
		System.out.println("One parameter volume :" + b2.volume());
		System.out.println("Three parameter volume :" + b3.volume());
	}

 	}


