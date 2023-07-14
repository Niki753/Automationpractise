package string;

public class string12 {


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
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palinString("abc");
	}

}
