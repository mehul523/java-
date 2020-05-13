package classobject;


class stude {
	   
	 int id;
	 String name;
	 
	 void insertrec(int i,String n)
	 {
		 id=i;
		 name=n ;
		 
	 }
	 void display()
	 {
		 System.out.println("id:"+id +"\nname:"+name);
		 
	 }
}

public class methodcreateobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object
     stude s1=new stude();
     stude s2=new stude();
     
     s1.insertrec(101, "mehul");
     s2.insertrec(104, "tony");
     s1.display();
     s2.display();
	}

}
