package classobject;


class rectangle {
	  int length;
	  int width;
	  
	  void insert(int l, int w)
	  {
		  length=l;
		  width=w;
		  
	  }
	  void calculate ()
	  {
		  System.out.println(length*width);
		  
	  }
	  
	  
}
public class rectanglecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle r1=new rectangle();
		
		r1.insert(11,5);
		r1.calculate();

	}

}
