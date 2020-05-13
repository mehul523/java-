package basicstring;

public class stringrx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ///litereral 
		 String s1= "mehul" ;
         String s2="mehul";
		
           
            //object to create string 
         String s3=new String("mehul");
         
         //char ;
          char arr[] = {'a','b','c','d','e'};
       //arrary string 
          String s4=  new String(arr);
          
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
         System.out.println(s4);
         
         
         //iimuaded
         
         
         String s5 =new String("tony");
         
          s5.concat("stark");
         System.out.println(s5);   //print is tonty beacuse it is us for the obje ct 
         
         String s6= s5.concat("stark");
         System.out.println(s6);   
         //print is tont stark  beacuse it is use for the  unther string object 

        
         
         
           //string buffer ;;
         StringBuffer s10=new StringBuffer("mehul");
         s10.append("bhai");
         System.out.println(s10); //append //insert //replace    
 
         

	}

}
