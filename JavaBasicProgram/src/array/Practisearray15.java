package array;

public class Practisearray15 {

	public static void main(String[] args) {
		// print elements on even position and odd position

		int a[]= {1,2,3,4,5,6,7,8,9,9,9,9};// 2,4,6 //index 1,3,5
		for(int i =1;i<a.length;i=i+2) {
			System.out.print(a[i]+ " ");
			
		}
		
		
		System.out.println("\nprint elements odd position");
		int b[]= {1,2,3,4,5,6,7,8,9};// 1,3,5 //index 0,2,4,6,8
		for(int i= 0;i<b.length;i=i+2) {
			System.out.print(b[i]+ " ");
		}
		
		
		
	}

}
