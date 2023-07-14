package tuesday.practise;

public class PalNumber {

	public static void PalindromeNumber(int num) {
		int rev = 0, rem, temp;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;// 1//2
			rev = rev * 10 + rem; // 1
			num = num / 10;// 12

		}
		if (temp == rev) {
			System.out.println("no. is palindrome");
		}

		else {
			System.out.println("no. is not palindrome");
		}
	}

	public static void main(String[] args) {
		PalindromeNumber(1221);
		System.out.println("***************************************");
		PalindromeNumber(12345);
	}

}
