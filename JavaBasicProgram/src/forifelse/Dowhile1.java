package forifelse;

public class Dowhile1 {

	public static void main(String[] args) {
     System.out.println("******** print day 1 to day 31 using for loop*******");
        for (int day= 1;day<32;day++)
        {
        	System.out.println(+day + " day");
        }

        System.out.println("******** print day 1 to day 31 using while loop*******");
           int dayy= 1;
           while(dayy<=31)
           {
        	   System.out.println( "day "+dayy);
        	   dayy++;
           }

           System.out.println("******** print day 1 to day 31 using do while loop*******");
           int dayyy= 1;
           do
           {
        	   System.out.println( " day "+dayyy);
        	   dayyy++;
           }
           while(dayyy<=31);
           //while(dayyy==31)//still it will be executed once	
        
	}

}
  
