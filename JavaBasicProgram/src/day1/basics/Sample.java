package day1.basics;

public class Sample {
	static  double d = 10.5;
	static double e = 15.5;
	static double f;
	double g =100.0;
	double h = 25.5;
	double i; 
	public static void main(String[] args) {
		System.out.println("I am Nikita Verma.");
		System.out.println("I live in Hyderabad.");
		System.out.println("I live in Hyderabad.I have completed MBA.\n I have 7 years of work experience");
		System.out.println("I am basically from Madhya Pradesh.\t I completed my degree in 2015.");
		int a=10,b= 15,c;
		c=a+b;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("Result  = " +c);
		a=25;
		b=30;
		c=a*b;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("Result  = " +c);
		a=2500;
		b=30;
		c=a/b;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("Result  = " +c);
		a=2500;
		b=30;
		c=a%b;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("Result  = " +c);
		System.out.println("static variables ");
		f=e+d;
		System.out.println("d = " +Sample.d);
		System.out.println("e = " +Sample.e);
		System.out.println("Result  = " +f);
		f= e*d;
		System.out.println("d = " +Sample.d);
		System.out.println("e = " +Sample.e);
		System.out.println("Result  = " +f);
		e = 100;
		d = 20;
		f = e/d;
		System.out.println("d = " +Sample.d);
		System.out.println("e = " +Sample.e);
		System.out.println("Result  = " +f);
		e = 100;
		d = 20;
		f = e%d;
		System.out.println("d = " +Sample.d);
		System.out.println("e = " +Sample.e);
		System.out.println("Result  = " +f);
		Sample ref = new Sample ();
		ref.i = ref.g+ref.h;
		System.out.println("g = " +ref.g);
		System.out.println("h = " +ref.h);
		System.out.println("Result  = " +ref.i);
		ref.g = 125.5;
		ref.h = 29.0;
		ref.i = ref.g*ref.h; 
		System.out.println("g = " +ref.g);
		System.out.println("h = " +ref.h);
		System.out.println("Result  = " +ref.i);
		Sample ref1 = new Sample ();
		System.out.println("g = " +ref1.g);
		System.out.println("h = " +ref1.h);
		ref1.g = 2500.0;
		ref1.h = 10.0;
		ref1.i = ref1.g/ref1.h;
		System.out.println("g = " +ref1.g);
		System.out.println("h = " +ref1.h);
		System.out.println("Result  = " +ref1.i);
		ref1.g = 2500.0;
		ref1.h = 10.0;
		ref1.i = ref1.g%ref1.h;
		System.out.println("g = " +ref1.g);
		System.out.println("h = " +ref1.h);
		System.out.println("Result  = " +ref1.i);
		
		
	}

}
