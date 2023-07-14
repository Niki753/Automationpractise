package randompractise1;

import java.util.Scanner;

public class Cifelseevenoroddusingscanner {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("enter number u wan to check if its even or odd");
		num = scn.nextInt();

		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is eodd");

		}

	}

}
