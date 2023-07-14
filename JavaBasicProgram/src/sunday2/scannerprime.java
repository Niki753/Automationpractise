package sunday2;

import java.util.Scanner;

public class scannerprime {

	static void prime() {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("enter no. to check if its prime or not");

		num = scn.nextInt();
		int ct = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				ct++;
			}
		}
		if (ct == 2) {
			System.out.println("no. is prime");
		} else {
			System.out.println("no. is not prime");

		}

	}

	public static void main(String[] args) {
prime();
	}

}
