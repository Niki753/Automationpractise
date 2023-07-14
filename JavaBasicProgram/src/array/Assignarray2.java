package array;

import java.util.Arrays;

public class Assignarray2 {

	public static void main(String[] args) {
System.out.println("\n 14th java prog to sort the elements of an array in ascending order");
    
     char []c1 = {'b','z','f','c','g','k','q'};
     System.out.println(c1.length);// to know the no. of elements
     for(int i =0;i<c1.length ; i++) {
    	 System.out.print(c1[i]+ " ");//for printing the elements
     }
     System.out.println("\n using copy of range");//to copy within a range
     char []c2 = Arrays.copyOfRange(c1, 1, 4);
     System.out.println(c2.length + "\n******");
     for(int i =0;i<c2.length;i++) {
    	 System.out.print(c2[i]+ " ");
     }
     System.out.println("\n********");
     Arrays.sort(c2); //for sorting
     for(char j:c2)
     {
    	 System.out.println(j);
     }
     
	}

}
