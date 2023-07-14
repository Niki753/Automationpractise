package array;

import java.util.Arrays;

public class Practisearray17 {

	public static void main(String[] args) {
 
		int a[]= {5,6,8,1,2,3};
		Arrays.sort(a); 
		
//		System.out.println(a.length);//5 4 3 2 1 0
		for(int i = a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
