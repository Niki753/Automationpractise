package randompractise1;

public class LPalindrome1 {

	public static void main(String[] args) {
 
		int num=121,rev=0,rem,temp;
		temp=num;
		for(;num>0;) {
			rem= num%10;    //121%10=1//
			rev= rev*10+rem;//1       // 
			num= num/10;    //12      //
 			
		}
		if(temp==rev) {
			System.out.println("num is palin");
		}
		else {
			System.out.println("no. is not palindrome");
		}
		
	}

}
