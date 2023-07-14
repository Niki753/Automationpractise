package readpropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile3 {

	public static void main(String[] args) throws IOException{
       FileInputStream fis = new FileInputStream("D:\\Study\\Nikita\\AutomationSession\\Workspace\\JavaBasicProgram\\prop\\test.properties");
	
	Properties prop = new Properties();
	prop.load(fis);
	
	System.out.println(prop.getProperty("key1"));
	System.out.println(prop.getProperty("key2"));
	
	}

}
