package randompractise1;

 
public class Isumofnaturalnumber {

		public static void main(String[] args) {
 //sum of natural nos. 1 to 5
		int num=6,sum=0;
		for(int i=1;i<num;i++) { //1<6  // 2<6 //3<6  //4<6   //5<6    //6<6 cond false
			sum=sum+i;         //0+1=1//1+2=3//3+3=6//4+6=10//10+5=15//
		}
		System.out.println(sum);
	
		// Display uppercased alphabet using for loop
	
		
		for(char c1 ='A';c1<='Z';c1++) {
			System.out.print(c1+ " ");
		}
		

		// Display lowecased alphabet using for loop
	
		System.out.println();
		for(char c2='a';c2<='z';c2++) {
			System.out.print(c2+" ");
		}
     System.out.println();
 
		for(char d1='A';d1<='Z';d1++ )
		{
			int d2=d1;
			System.out.println(d1+" : " +d2  );
		}
		
	}
		
}
