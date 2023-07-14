package readpropertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readpropfile4 {

	public static void main(String[] args) throws IOException {

		String CurrentDir = System.getProperty("user.dir");

		System.out.println(System.getProperty("user.dir"));

		String userdir = CurrentDir + "/prop/test.properties"; 

		FileInputStream fis = new FileInputStream(userdir);
		Properties prop = new Properties();

		prop.load(fis);

		System.out.println(prop.getProperty("key1"));
		System.out.println(prop.getProperty("key2"));

	}

}
