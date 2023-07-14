package string.practise;

import java.util.Spliterator;

public class Astring1 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s4 = "abc";
		System.out.println("s1 :"+s1);
		System.out.println("s4 :"+s4);
		
        System.out.println("concating a1 and s4");
		String s5 = s1.concat(s4);
		System.out.println("s5 : " + s5);
		System.out.println("print string s1");
		
		System.out.println(s1);
		System.out.println("print string s1 using for loop");
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}

		System.out.println("\nusing concat method concating 2 string");
		String s2 = "def";
		String s3 = s1.concat(s2);
		System.out.println(s3);

		System.out.println("\nprint array");
		int[] a = { 1, 2, 7 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		String s6 = "i am doll";
		System.out.println(" elemnet on 2nd index that is second element: "+s6.charAt(2));
		
		System.out.println(" length of s6 :"+s6.length());
		System.out.println(" l will come on this index : " +s6.indexOf('l'));
		System.out.println(   "doll comes on this index :"+ s6.indexOf("doll"));
		
		
		System.out.println(" doll comes on this index from right :"+ s6.lastIndexOf("doll"));
		System.out.println("l comes on this index from right : "+s6.lastIndexOf('l'));
		String s7= "Abc";
		String s8= "Abc";
		String s9 = "abc";
		
		System.out.println(s7.equals(s9));
		System.out.println(s7.equalsIgnoreCase(s9));
		System.out.println(s7.equals(s9));
		System.out.println(s7.equalsIgnoreCase(s9));
		
        String 	s10 = s6.toUpperCase();
		System.out.println(s10);
		String s11 = s10.toLowerCase() ;
		System.out.println(s11);
		
		String s12 = s11.replace('a', 'k');
		System.out.println(s12);
		
		String s13 = s11.replace('l', 'j'); 
		System.out.println(s13);
		
		String s14 = s10.replace("DOLL", "barbie");
		System.out.println("s14 "+s14);
		
		String s15 = "I am very cute doll";
		System.out.println("s15 :" +s15);
		
		System.out.println("using split ");
		String[] strary = s15.split(" ");
		for(String z:strary ) {
			System.out.println(z);
		}
		System.out.println("substring");
		String s16 = s15.substring(4);
		System.out.println(" s16: " + s16);
		
		String s17 = s15.substring(0, 9);
		System.out.println( " s17 : "+ s17);
		
		 
	}}
