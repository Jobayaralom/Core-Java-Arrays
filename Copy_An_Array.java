package Exercise_1;

import java.util.Arrays;

public class Copy_An_Array {

	public static void main(String[] args) {
	       
		        int[] myArray = new int[10];
		        myArray[0]= 10;
		        myArray[1]= 20;
		        myArray[2]= 30;
		        myArray[3]= 40;
		        myArray[4]= 50;
		        myArray[5]= 60;
		        myArray[6]= 70;
		        myArray[7]= 80;
		        myArray[8]= 90;
		        myArray[9]= 100;
		       
		        
		        System.out.println(Arrays.toString(myArray));

		        
		        int[] myArray1 = new int[10];
		        //we can do it by this way too
		       // myArray1 = myArray;
		     System.arraycopy(myArray, 0, myArray1, 0, 10);
		        
		        System.out.println(Arrays.toString(myArray1));
		        
		       
		    }
		 
	}


