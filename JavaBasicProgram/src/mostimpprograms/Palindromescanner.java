package mostimpprograms;

public class Palindromescanner {

	static void palindrome(int num) {

//		int num = 121;
		int rev = 0, rem;
		int temp = num;

		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		// return rev;

		if (temp == rev) {
			System.out.println("number is palin");
		} else {
			System.out.println("no. is not palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome(1221);

	}
}