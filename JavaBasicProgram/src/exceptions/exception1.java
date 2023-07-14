package exceptions;

public class exception1 {

	public static void main(String[] args) {
 int i =10,j=0,k;
 try {
	 System.out.println("inside  try block");
	 k=i/j;
	 System.out.println(k);
 }
 catch(Throwable obj){
	 System.out.println("inside catch block");
    // System.out.println(obj);
	 //System.out.println(obj.getMessage()); 
	 obj.printStackTrace();
 } 
 
		
	}

}
