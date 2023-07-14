package randompractise1;

import java.util.Scanner;

public class Nfactorsofpositivenumber2usngscan {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("enter no. u want to get factors");
		num = scn.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
