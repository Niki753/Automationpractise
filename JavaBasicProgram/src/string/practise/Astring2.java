package string.practise;

public class Astring2 {

	public static void main(String[] args) {

		String s1 = "I am very cute doll";
		System.out.println("s1: " + s1);
		System.out.println(s1.charAt(18));
		System.out.println(s1.length());
		System.out.println("using for loop");
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("splitting");
	
		String[] strAry = s1.split(" ");
		System.out.println("using for each loop");
		for (String z : strAry) {
			System.out.println(z);
		}
		System.out.println("using for loop");

		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
       System.out.println("\n");
	   String[]strAry2 = s1.split(" ");
	   for(int i=strAry2.length-1;i>=0;i--) {
		   System.out.print(strAry2[i]+ " ");
	   }
	   
        System.out.println("\n ..........");
	    String s3="I am from Pune";
		System.out.println("Actual String: "+s3);
		String str[]=s3.split(" ");
		String temp="";
//		for(String s:str) {
//			System.out.println(s);
//		}
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
		}
		System.out.println("reverse statement: "+temp);

	    System.out.println("\n");
	    
     	String s4= "I am living in Hyderabad";
	    String[] strary= s4.split(" ");
	    
	    for(String z:strary){
	    	System.out.println(z);
	    }
	    
	    String temp1 = "";
	    for(int i =strary.length-1;i>=0;i--) {
	    	temp1 =temp1 + " " +strary[i];
	    }
	    System.out.println(temp1+ " ");
	
	
	
	
	
	
	}

}
