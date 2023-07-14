package randompractise1;

public class LPalindrome2method {

	static int palin(int num) {
		int rev = 0, temp, rem;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("no. is palin");
		} else {
			System.out.println("no. is not palin");
		}
		return rev;
	}

	public static void main(String[] args) {
		palin(12121);
	}

}
