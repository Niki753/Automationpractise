package scannerclass;

import java.util.Scanner;

public class scannerarms {

	static void arms() {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("enter no. to check if its arms or not");
		num = scn.nextInt();
		int cubesome = 0, rem, temp;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			cubesome = cubesome + rem * rem * rem;
			num = num / 10;

		}
		if (cubesome == temp) {
			System.out.println("no. is arms");

		} else {
			System.out.println("no. is not arms");

		}
	}

	public static void main(String[] args) {
arms();
	}

}
