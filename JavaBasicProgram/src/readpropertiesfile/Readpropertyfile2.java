package readpropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile2 {

	public static void main(String[] args) throws IOException {
 
	
	String fileLocation = "D:\\Study\\Nikita\\AutomationSession\\Workspace\\JavaBasicProgram\\propertyfile2.properties";
	FileInputStream fis = new FileInputStream(fileLocation);
	Properties prop = new Properties() ;
	prop.load(fis);
	
	System.out.println(prop.getProperty("key1"));

	System.out.println(prop.getProperty("key2"));
	 
	String keytwo = prop.getProperty("key2");
	int amt = Integer.parseInt(keytwo);// converting from string into integer
	int k = amt*10; //so that we can perform arithmetic operations 
	System.out.println(k);

	
	}

}
