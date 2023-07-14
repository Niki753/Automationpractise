package readpropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readpropfile1 {

	public static void main(String[] args) throws IOException{

		 String filelocation= "D:\\Study\\Nikita\\AutomationSession\\Workspace\\JavaBasicProgram\\prop\\test.properties";
	
		 FileInputStream fis = new FileInputStream(filelocation);
		 Properties prop = new Properties(); 
	     prop.load(fis);
	     
	System.out.println(prop.get("key1"));
	System.out.println(prop.get("key2"));
	}
}
