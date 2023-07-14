package string;

public class string1 {
/*	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			//temp = temp + str.charAt(i);
		}
		return temp;}
	*/
	
	static void reverse (String s10) 
	{	
		for(int i =s10.length()-1;i>=0;i--)
		{
			System.out.print(s10.charAt(i));
		}
	}
	
	public static void main(String[] args) {

//String str1= new String("Hello ");
		String str1 = "Hello Java ";
		System.out.println(str1);
		System.out.println("Length of str1 " + str1.length());

		String str2 = "hello Java ";

		System.out.println(str2);
		System.out.println("Length of str2 " + str2.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		String str3 = "Core Java";
		System.out.println(str3);
		System.out.println("Length of str3 " + str3.length());

		System.out.println(str2.equals(str3));
		System.out.println(str2 == str3);

		System.out.println("*****using methods*****");
		System.out.println(str1);
		System.out.println("Length of str1 " + str1.length());

		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(5));// space

		System.out.println(str1.indexOf('H'));
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf("Hello"));

		System.out.println(str1.lastIndexOf('J'));
		System.out.println(str1.lastIndexOf('e', 5));
		System.out.println(str1.lastIndexOf('l', 5));
		System.out.println(str1.lastIndexOf("ello", 4));
		System.out.println("*********");
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2, 8));

		System.out.println(str1.concat(str3));

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		String s1 = "Pune";
		String s2 = "Mumbai";
		System.out.println(s1.concat(s2));
		String x1 = s1.concat(s2);
		System.out.println(x1);

		String t1 = "      I am Nikita       ";
		System.out.println(t1);
		System.out.println(t1.length());
		System.out.println(t1.trim());

		String t2 = t1.trim();
		System.out.println(t2.length());

		System.out.println(t1.replace('a', 'z'));
		System.out.println(t1.replace("Nikita", "Yogesh"));
		System.out.println(t1.replaceFirst("I", "z"));
		String t3 = "  ";
		System.out.println(t3.length());
		int a = t3.length();
		System.out.println(a);
		System.out.println(t3.isEmpty());
		String s5= "";
		System.out.println(s5.isEmpty());
//System.out.println("usin");
		String s7= "Hi I am Nikita";
		for(int i=0;i<s7.length();i++) {
			System.out.print(s7.charAt(i));
		}
		
		System.out.println("\n*******");
		for(int i = s7.length()-1;i>=0;i--) {
			System.out.print(s7.charAt(i));
		}
		
		System.out.println("\n*****"); 
		String temp= "";
		for(int i = s7.length()-1;i>=0;i--) {
			temp= temp+ s7.charAt(i);
		}
            System.out.println(temp);
            System.out.println("\n************");
             
            //System.out.println( reverseString("abc"));
            reverse ("abc");
	}
	

}
