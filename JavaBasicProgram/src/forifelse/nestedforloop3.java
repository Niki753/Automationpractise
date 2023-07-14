package forifelse;

public class nestedforloop3 {

	public static void main(String[] args) {
		for (int a = 0; a < 3; a++) {
			System.out.println("Hello a :" + a);
		}
		System.out.println("nested loop prac");
		for (int i = 0; i < 5; i++) {// 0 1 2 3 4
			System.out.println("value of i " + i);
			for (int j = 0; j < 2; j++)// 0 1 01 01 01 01
			{
				System.out.println("\tvalue of j " + j);
			}
		}
		System.out.println("nested loop prac2");
        for(int b=0;b<3;b++) {//
            System.out.println("value of b " +b);
                 for (int c=0;c<2;c++) {//
                	 System.out.println("\t\tvalue of c " +c);
                             for (int d=0;d<1;d++) {// 
                            	 System.out.println("\t\t\tvalue of d " +d);
	}}}}

}

/*
  b0
    c0                       
      d 0                   
   c1                      
     d0                    
  b1                       
    c0
      d0                     
     c1
       d0
  b2
      c0
       d0
      c1
       d0                                       
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
*/        
