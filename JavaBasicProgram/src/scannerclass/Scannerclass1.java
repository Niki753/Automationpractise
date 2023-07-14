package scannerclass;

import java.util.Scanner;

public class Scannerclass1 {

	public static void main(String[] args) {
      int age;
      double salary;
      String name;
      
      Scanner scn = new Scanner(System.in);//object creation
      
      System.out.println("Enter your age");
      age = scn.nextInt();
      System.out.println("age :" +age);
      
      System.out.println("Enter your salary");
      salary = scn.nextDouble();
      System.out.println("Sal :" +salary);
      
      System.out.println("Enter your name");
      name = scn.next();
      System.out.println("name :" +name);
      
      char grade;
      System.out.println("enter grade");
      grade = scn.next().charAt(0);
      System.out.println("grade :" +grade);
	}
	

}
