package forifelsepractise2;

public class Ifelse1 {

	public static void main(String[] args) {
		int age = 9;
		if (age >= 18)// if else
		{
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}
		char c1 = 'a';// if else ladder
		if (c1 == 'a') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'e') {
			System.out.println("c1 is a vowel");
		} else if (c1 == 'i') {
			System.out.println("c1 is a vowel");
		}

		else if (c1 == 'o') {
			System.out.println("c1 is a vowel");
		}

		else if (c1 == 'u') {
			System.out.println("c1 is a vowel");
		} else {
			System.out.println("c1 is a consonant");
		}
		int age1 = 19;//nested if else
		char bg = 'A';
		int weight = 59;
		if (age1 >= 18)
			if (bg == 'A')
				if (weight >= 50) {
					System.out.println("eligible to doante");
				} else {
					System.out.println("not eligible bcz weight is less thn 50");
				}
			else {
				System.out.println("not eligible bcz bg is not 'A'");
			}
		else {
			System.out.println("not eligible bcz age is less than 18");
		}
	}
}
