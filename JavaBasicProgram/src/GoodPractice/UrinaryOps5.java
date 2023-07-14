package GoodPractice;

public class UrinaryOps5 {

	public static void main(String[] args) {
        int a = 7, b;
		b = a-- + --a + --a + a;
	
		System.out.println("a: "+a);//
		System.out.println("b: "+b);//
		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		
		System.out.println(a);//
		System.out.println(b);//


	}

}
