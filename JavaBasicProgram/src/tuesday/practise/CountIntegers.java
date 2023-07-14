package tuesday.practise;

public class CountIntegers {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1234; n != 0; count++)// 1 //2 //3 //4
			n = n / 10;         // n=n/10 //1234 //123 //12 //1
		{
			System.out.println(count);
		}

	}
}
