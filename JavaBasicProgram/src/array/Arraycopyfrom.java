package array;

import java.util.Arrays;

public class Arraycopyfrom {

	public static void main(String[] args) {
      char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
      System.out.println(copyFrom.length);
      System.out.println("************");
      for(int i = 0;i<copyFrom.length;i++)
    	  System.out.print(copyFrom[i]+ "  ");
      System.out.println("\n");
      System.out.println("*******using Arrays.copy of*****");
      
      System.out.println("\n");
      char[] copyTo = Arrays.copyOf(copyFrom,copyFrom.length);
      for(int i =0;i<copyFrom.length;i++)
    	  
      System.out.print(copyTo[i] + "  ");
      
      System.out.println("\n");
      System.out.println(copyTo.length);
      System.out.println("********");
    
      char []copyWithRange = Arrays.copyOfRange(copyFrom, 3,copyFrom.length );
      for(int i =0;i<copyWithRange.length;i++)
    	  System.out.print(copyWithRange[i]+ " ");
      System.out.println("\n"+ copyWithRange.length );
    	
      System.out.println("\nAfter sorting****");
      Arrays.sort(copyWithRange);
      for(char i:copyWithRange) {
    	  System.out.print(i+ " ");
      }
	}
	


}
