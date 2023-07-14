package mostimpprograms;

public class RevNum1 {

	static int revNum(int num) {
		// int num= 456
		int rev = 0, rem;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(revNum(1235));
	}

}
