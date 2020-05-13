package thisstatickeyword;

class studentdata{
	
	int rollNo;
	String name;
	int year;
	
	
	studentdata()
	{
		
		 rollNo=0;
			name="new student";
			year=0;
		}
	studentdata(int r,String n,int y)
	{
		rollNo=r;
		name=n;
		year=y;
	}


	
	void setRollNo(int r)
	{
		rollNo=r;
	}
	void setName(String n)
	{
		name=n;
	}
	void setYear(int y)
	{
		year=y;
	}
	void display()
	{
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name   : " + name);
		System.out.println("Year   : " + year);
	}

}
public class ex33clg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdata s=new studentdata();
		studentdata s1=new studentdata(1,"ABC",1);
		
		s.display();
		
		System.out.println("\n");
		
		s1.display();
		
		System.out.println("\n");  
		
		s.setRollNo(10);
		s.setName("Idris");
		s.setYear(15);
		
		s.display();

	}

}
