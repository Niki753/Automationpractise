package randompractise1;

public class JReversenumber1method {

	static int reverse(int num) {

		int rev = 0, rem;

		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1234568));
	}

}
