package randompractise1;

import java.util.Scanner;

public class ELargestamong3nosusngscan {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1, num2, num3;
		System.out.println("enter num1");
		num1 = scn.nextInt();

		System.out.println("enter num2");

		num2 = scn.nextInt();

		System.out.println("enter num3");

		num3 = scn.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is largest");

		} else {
			System.out.println("num3 is largest");
		}

	}

}
