package string;

public class string2 {

	public static void main(String[] args) {
		String s1 = "I am Nikita and I live in Hyderabad";

		System.out.println(s1);
		System.out.println("\n****using split method**********");
		String[] str = s1.split(" ");
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("****print the string********************");

		String s2 = "Hi I am learning automation ";
		System.out.println(s2);
		System.out.println(s2.length());
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(s2.charAt(i));
		}

		System.out.println("*****reversing character by character*********");

		String s3 = "Hi I am ";
		System.out.println(s3);
		for (int i = s3.length() - 1; i >= 0; i--) {
			System.out.print(s3.charAt(i));
		}
		System.out.println("\n******");
		String s4= "hello how are you?";
		String[] str1= s4.split(" ");
		for(String s8:str1) {
			System.out.println(s8);
		}
		System.out.println("\n*********");
		String []str2= s4.split(" ", 3);
		for(String s: str2) {
			System.out.println(s);
		}
		
		String s5= "hi how are you?";
		System.out.println("value of s5 is :" +s5);
        String[]str4=s5.split(" ");
		String temp ="";
		System.out.println("\n**********reversing it word byword********8");
		for(int i =str4.length-1;i>=0;i--)
			temp= temp+str4[i];
		System.out.println(temp);
		
		
	}
	
}
