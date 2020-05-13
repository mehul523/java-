package basicstring;

public class basicstringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //string literal intern way
		   //stored in string pool
		//str1 and str2 is reference variable  pointing the same literal 
		   String str1= "hello";
		   String str2="hello";
		   
		   //not compare the  content  
		   //compare to the hash code  in str1 and str2 which has same of  the  hello 
		   if(str1==str2) {
			    System.out.println("same string");
		   }
			    else
			    {
			      System.out.println("iytisnot same stri ng");	
			    }
		   //useing  new operaors   string objects
		   //string object construct o fheap area with hello at its content 
		   //two dofferent object but content wil be same 
     
      String str3=new String("mehul");
      String str4= new String("mehul");
      
      if(str3.equals(str4)) {
		    System.out.println("same string...");
	   }
		    else
		    {
		      System.out.println("itisnot same stri ng");	
		    }
          
      
      if(str3.compareTo(str4)==0) {
    	  
    	    System.out.println("compared ");
      }
      else {
    	   System.out.println("not compare");
      }
	
		  //string  -------------> 
	  
	String str ="mehul,rahul,joe,tony,hulk,capamerika";
	
	 //length finding 
	 int len= str.length();
	 System.out.println("lengh : "+len); 
	 
	 //start to end charcter print 
	 
	 System.out.println(str.charAt(0) + "  |  " +str.charAt(len-1));
	
	  //to upper case 
	 
      String s= str.toUpperCase();
	
	 System.out.println("uppercadse:"+s);
	 
	 //to lowercase 
	
	 String s1=str.toLowerCase();
	 System.out.println("lower:" +s1);
	 
	 
	  //check string is their or not 
	   
	 
	 if(str.contains("joe")) {
		         System.out.println(" \njoevis the their") ;
	 }
	 else {
		 

         System.out.println("\njoe is not their") ;

	 }
	 
	  //string remove in substring
	  //it is remove first 5 character of string 
	 String s6= str.substring(6);
	 System.out.println(s6);
 
   //print string range of its 
  String s3=str.substring(6, 11);
  System.out.println(s3) ;
  
  
  
  //replace string 
  
   String s4 =str.replace("rahul", "spidermen");
    System.out.println(s4) ;

    
    //string in to arrrary convert ;
    
    
      char arr[] =str.toCharArray();

      System.out.println("\nstring to arrary:") ;

       for( int i=0;i<arr.length;i++) {

	         System.out.print(" "+ arr[i]) ;
    	     
       }
	 

       System.out.println("\n");
    
        //spilt and trim the string;
         
           String arrstr[] =str.split(",");
            for (int i=0;i<arrstr.length;i++) {
            	   System.out.println(arrstr[i].trim());
            }
            	   
            System.out.println();
            
            //data during regisstration 	   
  
              String email ="mehul523.com";
              String pno="1234567991";
              String pass="mehul";
               
                if(!email.isEmpty())  {
                    System.out.println("email is availabe");
                
                      if(!(email.contains("@") && email.contains("."))) {
                       System.out.println("email  valid..");

                        }
                         else {
                        	 System.out.println("email not vaild..");

                         	}
                }
                else {
                    System.out.println("email not available");

                	
                }

                if(!pno.isEmpty()) {
                	   
                    System.out.println("pno  is  available");
                  
                      if(pno.length()!=10)
                      {
                          System.out.println("phono is not   currect a");

                      }
                      else {
                          System.out.println("phono  is  correct");

                      }
                }
                else {
                    System.out.println("pno is not available");

                }
             
                //string immute 
                
                String string =new String("Hello");
                string.concat("words");//+opereators 
                
                System.out.println("\n string :: "+string);
                
                
                
               
                
                
                
                
                
                
                

                
                
                
	}


}
