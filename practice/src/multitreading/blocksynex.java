package multitreading;



class table2 {
	  
	   void print(int n) {
		   
	  
		  synchronized (this) { //synchronized block;
		 for(int i=1;i<=5;i++){  
		     System.out.println(n*i);
		     
		     //sleep thread
		     
		     try{  
		         Thread.sleep(400);  
		        }catch(Exception e){System.out.println(e);}  
		 }
		 
	 }  //s method finish 
}
}


class mythread12  extends Thread {
	
	 table2 t;  //constroctor 
	 mythread12(table2 t){
		 this.t=t;
			
	 }
	 
	 public void run() {
		 t.print(5); 
	 }
	
}


class Mythread22 extends Thread{  
table2 t;  
Mythread22(table2 t){  
this.t=t;  
}  
public void run(){  
t.print(100);  
}  
}  


public class blocksynex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		table2 obj = new table2();//only one object  
		mythread12 t1=new mythread12(obj);  
		Mythread22 t2=new Mythread22(obj);  
		t1.start();  
		t2.start();  
	}

}
