package tuesday.practise;

public class Primeno {

	static void method(int num) {
		//int num = 5
				int ct = 0;
		for (int i = 1; i < 6; i++) {
			if (num % i == 0) {
				ct++;
			}
		}if(ct==2) {
			System.out.println("no. is prime");
		}else {
			System.out.println("no. is not prime");
		}

	}

	public static void main(String[] args) {
		method( 5);
	}

}
