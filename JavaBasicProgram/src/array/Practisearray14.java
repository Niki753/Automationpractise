package array;

public class Practisearray14 {

	public static void main(String[] args) {
		// Java Program to print the duplicate elements of an array

		String[] a = { "java", "python", "c", "c++","java" };
        boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate element : "+a[i]);
				flag=true;
				}
			}

		}
		if(flag==false) {
			System.out.println("no duplicate element found");
		}

	}
}