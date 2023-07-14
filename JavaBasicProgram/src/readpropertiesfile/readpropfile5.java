package readpropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readpropfile5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\prop\\test.properties");// using dot (.)
		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.getProperty("key1"));
		System.out.println(prop.getProperty("key2"));
		System.out.println(prop.getProperty("key3"));

		String keythree = prop.getProperty("key3");// storing the value in string

		int amt = Integer.parseInt(keythree);// converting from string into integer
		int k = amt*10; //so that we can perform arithmetic operations 
		System.out.println(k);
	}
}