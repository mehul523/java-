package basicstring;

public class stringbufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // ----------->String mutturbule buffer
		//it is a safe structure 
		
		
		StringBuffer buffer =new StringBuffer("hello");
		buffer.append("word");
        System.out.println(buffer);

		//secound 
        
         StringBuffer b1=new StringBuffer("hello");
         b1.append("mehul");
         System.out.println(b1);

		//charquence runtime polymorphosm 
         
         CharSequence cs=null;
         cs=new String("hello");
         cs=new StringBuilder("mehul");
         cs=new StringBuffer("bye");
         
         System.out.println(cs);
		
	}

}
