package multitreading;


//this method work from first rrun of tread and ather ryun of thread

class table1 {
	  
	synchronized void print(int n) {
		 
		 for(int i=1;i<=5;i++){  
		     System.out.println(n*i);
		     
		     //sleep thread
		     
		     try{  
		         Thread.sleep(400);  
		        }catch(Exception e){System.out.println(e);}  
		 }
		 
	 }
}



class mythread11  extends Thread {
	
	 table1 t;  //constroctor 
	 mythread11(table1 t){
		 this.t=t;
			
	 }
	 
	 public void run() {
		 t.print(5); 
	 }
	
}


class Mythread21 extends Thread{  
table1 t;  
Mythread21(table1 t){  
this.t=t;  
}  
public void run(){  
t.print(100);  
}  
}  


public class syncronicemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		table1 obj = new table1();//only one object  
		mythread11 t1=new mythread11(obj);  
		Mythread21 t2=new Mythread21(obj);  
		t1.start();  
		t2.start();  
	}
	}

