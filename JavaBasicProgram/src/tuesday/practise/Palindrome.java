package tuesday.practise;

public class Palindrome {

	static void method(int num) {
		//int num = 1331, 
				int rev = 0, rem, temp;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
//		 return rev;

		if (temp == rev) {
			System.out.println("No. is palindrome ");
		}
		else {
			System.out.println("No. is not palindrome ");}
	}

	public static void main(String[] args) {
		method(123);
	}

}
