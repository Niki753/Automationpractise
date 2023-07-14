package array;

public class Practicearray7 {

	public static void main(String[] args) {
//copying without functions
		char og[] = { 'a', 'r', 'g', 't' };
		char dup[] = new char[og.length];

		for (int i = 0; i < og.length; i++) {
			dup[i] = og[i];
		}
		for (char c : dup) {
			System.out.println(c);
		}

		char og1[] = { 'b', 'r', 'a', 'c' };
		char dup1[] = new char[og1.length];

		for (int i = 0; i < dup1.length; i++) {
			dup1[i] = og1[i];
		}
		for (char c : dup1) {
			System.out.println(c);

		}
	}

}
