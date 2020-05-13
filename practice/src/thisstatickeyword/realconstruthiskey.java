package thisstatickeyword;
class stude{
	
	int rno;
	String name,course;
	float fees;
	
	stude(int rno,String name,String course)
	{
		
		this.rno=rno;
		this.name=name;
		
		this.course=course;
	}
	stude(int rno,String name,String course,float fees)
	{
		//this.fees=fees;
		this(rno,name,course);
		this.fees=fees;
	}
	void display() {
		System.out.println(rno+" "+name+" "+course+ " "+fees);
	}
}
public class realconstruthiskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stude s1=new stude(111,"mehul","mscit",9000f);
		s1.display();

	}

}
