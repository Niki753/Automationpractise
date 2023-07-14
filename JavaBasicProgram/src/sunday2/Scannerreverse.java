package sunday2;

import java.util.Scanner;

public class Scannerreverse {

	static int reverse() {
		Scanner scn = new Scanner(System.in);
		int num;

		System.out.println("enter the number your would like to reverse");
		num = scn.nextInt();

		int rev = 0, rem;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;

	}

	public static void main(String[] args) {
		System.out.println(reverse());
	}

}