package Wrapperclass;

public class boxing1 {

	public static void main(String[] args) {
           int age= 25;//variable dec and ini
           float sal= 25000.5f; //variable dec and ini
  
           char c1= 'c'; //variable dec and ini
           boolean d1 = false; //variable dec and ini
           x
           Integer a1= new Integer(age); //explicit boxing
           Integer a2= new Integer(25); //explicit boxing
           Integer a3= age; //implicit boxing
           Integer a4= 25; //implicit boxing
           Boolean d2= d1;//implicit boxing
           
           
           Float f= 25000.5f;//implicit boxing          
           Character c2= new Character(c1);//explicit boxing
           Character c3=  c1;//implicit boxing         
           
           int a =a3.intValue();//implicit unboxing
           float f1= f.floatValue();//implicit unboxing
           char c4= c3.charValue();//implicit unboxing
           
           boolean d3= d2.booleanValue();//implicit unboxing
           System.out.println(d3);
           
           
	}

}
