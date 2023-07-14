package forifelse;

public class practiseifelse {

	public static void main(String[] args) {
		int age = 9;
		if (age > 18) // if else
		{
			System.out.println("you are eleigible to vote");
		} else {
			System.out.println("you are not eligible to vote");
		}

		int num = 12;
		if (num % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
		char c1 = 'k'; // if else ladder
		if (c1 == 'a') {
			System.out.println("c1 is vowel");
		} else if (c1 == 'e') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'i') {
			System.out.println("c1 is vowel");
		} else if (c1 == 'o') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'u') {
			System.out.println("c1 is a vowel");
		} else {
			System.out.println("c1 is a consonant");
		}
		int age1 = 19;// NESTED IF else 
		char bg = 'A';
		int weight = 65;

		if (age1 >= 18) {
			if (bg == 'A') {
				if (weight >=50) {
					System.out.println(
							"eligible to donate becauase u are 18 and u have a blood grup A and ur weight is more than 50");
				} else {
					System.out.println("u r not eligible to donate blood because ur weight is less than 50 ");
				}
			} else {
				System.out.println("not eligible bcz bg is not A");
			}
		} else {

			System.out.println("not eligible bcz age is less than 18");
		}

	}
}

//System.out.println("eligibe to donate bcs u r 18 or more than 18");
//System.out.println("eligible to donate becauase u are 18 and u have a blood grup A");
