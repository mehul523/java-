package thisstatickeyword;


class student {
	
	   int id;
	   String name;
	   float fees;
	   
	   
	   student(int id,String name,float fees)
	   
	   {
		id=id;
		name=name;
		fees=fees;
	   }
	   
	   void display()
	   {
		   System.out.println(id+":"+name+":"+fees);
	   }
}

public class ithoutthiskeypro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student(1111,"mehul",40000);
		student s2=new student(2222,"rahul",50000);
        s1.display();
        s2.display();
	}

}
