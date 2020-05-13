package encapulation;

public class testaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 account a=new account();
	     a.setAcc_no(123456789);
	     a.setName("mehul");
	     a.setEmail("mehul523@gmail.com");
	     a.setAmount(20000);
	     
	     System.out.println("account no : " +a.getAcc_no());
	     System.out.println("name  : " +a.getName());
	     System.out.println("email : " +a.getEmail());
	     System.out.println("amout : " +a.getAmount());

	     
	     
	}
}
