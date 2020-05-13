package thisstatickeyword;

class Shape
{
	int h;
	int width;
	int breadth=1;
	int area;

	Shape(int h,int width)
	{
		this.h=h;
		this.width=width;
	    //this.breadth=1;
	}
	
	Shape(int h,int width,int breadth)
	{
		this.h=h;
		this.width=width;
		this.breadth=breadth;
	}
	
	 int   area()
	{
		area=h*width*breadth;
	     return area;
	  // System.out.println(area);
	}

}


public class ex2cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape s1=new Shape(10,12);
		Shape s2=new Shape(10,12,9);
		System.out.println("Two parameter area :" + s1.area());
		System.out.println("Three parameter area :" + s2.area());	
		//s1.area();
		//s2.area();
		
	}

}
