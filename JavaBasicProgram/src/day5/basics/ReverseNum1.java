package day5.basics;

public class ReverseNum1 {

	static int rev1() {
		int num = 123, rem;
		int rev = 0;

		for (; num > 0;) {
			rem = num % 10;           //3//
			rev = rev * 10 + rem;///3*10+3
			num = num / 10;//3
		}
		return rev;

	}

	public static void main(String[] args) {
		System.out.println(rev1());
	}

}
