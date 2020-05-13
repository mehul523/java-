package abstraction;

interface bank11 {
	   int  inter();
	
}


class boi11 implements bank11 {
	
	    public int inter() {
	    	return 9;
	    }
}

class  sbi11 implements bank11 {
	
    public int inter() {
    	return 7;
    }
}

public class baninterex {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		bank11  ba;
		ba= new boi11();
		System.out.println(" "+ba.inter());
		ba=new sbi11();
		System.out.println(" "+ba.inter());
	}

}
