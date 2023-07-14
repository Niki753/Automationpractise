package tuesday.practise;

public class Palnum {

	static int palin(int num) {
		int rev = 0, rem, temp;
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (temp == rev) {

			System.out.println("number is palin");
		} else {
			System.out.println("no. is not palindrome");
		}
		return rev;
	}

	public static void main(String[] args) {
		palin(121);
	}
}

static void palinString(String str) {
	String s1 = str;
	String temp = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		temp = temp + str.charAt(i);
	}
	if (temp.equals(s1)) {
		System.out.println("Given string is a palindrome..." + str);
	} else {
		System.out.println("Given string is not a palindrome..." + str);
	}
/*
	kjjdkkdiuukdkdidkdkidkkdidkkdidnnikikdkkdjydkkdnjuhsskkhmsjusolskjsjsjskksikn
	*/