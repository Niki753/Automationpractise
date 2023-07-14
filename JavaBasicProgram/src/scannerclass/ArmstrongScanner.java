package scannerclass;

import java.util.Scanner;

public class ArmstrongScanner {
//armstrong number using scanner class
	static void armstrongscanner() {
		Scanner scr = new Scanner(System.in);

		int num;
		System.out.println("Enter your num");
		num = scr.nextInt();

		int rem, cubesome = 0, temp;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			cubesome = cubesome + rem * rem * rem;
			num = num / 10;
		}
		if (temp == cubesome) {
			System.out.println("no. is armstrong");
		} else {
			System.out.println("no. is not armstrong");

		}
	}

	public static void main(String[] args) {
		armstrongscanner();
	}

}
