package basic;

public class multidimentionarrayp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7

		int y = myNumbers[0][2];
		System.out.println(y); // Outputs 7
          
		  
		System.out.println("display indi visual arraay");//display indivisual  array code
		  for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
		  }
		  
	}

}
