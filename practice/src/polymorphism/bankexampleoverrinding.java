package polymorphism;

class bank{
	
	int interest() {
		
		return 0;
	}
}

class sbi extends bank {
	  int interest() {
			
			return 8;
		}
}


class  boi extends bank {
	  int interest() {
			
			return 7;
		}
}

class axis extends bank {
	  int interest() {
			
			return 9;
		}
}

public class bankexampleoverrinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     sbi s=new sbi();
	 boi b=new boi();
	 axis a=new axis();
	 
	 System.out.println("sbi::"+s.interest());
	 System.out.println("boi::"+b.interest());
	 System.out.println("axis::"+a.interest());

	}

}
