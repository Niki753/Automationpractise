package randompractise1;
//
import java.util.Scanner;

public class Dcheckvowelusingifelse {

	public static void main(String[] args) {

		Scanner scn= new Scanner(System.in);
       System.out.println("enter character");
		char c1 ;
		c1=scn.next().charAt(0);

		if (c1 == 'a') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'e') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'i') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'o') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'u') {
			System.out.println("c1 is a vowel");
		} else {
			System.out.println("c1 is a consonant");

		}

	}
}