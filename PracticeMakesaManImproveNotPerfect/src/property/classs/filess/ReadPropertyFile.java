package property.classs.filess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

//basically the comfiguration data we will wrote and read in property file
//when we work with database and usernames all details once we get this here we can use this variables in our code
public class ReadPropertyFile {
//read data from property file
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
 
		// passing file path
		String filepath = System.getProperty("user.dir") + "\\data\\example.properties";

		// FileInputStream ->making the file open to read
		FileInputStream file = new FileInputStream(filepath);

		// loading the file to read
		properties.load(file);

		// close
		file.close();

		// read data from property file(one of the ways)
		String mobile = properties.getProperty("mobile");
		String name = properties.getProperty("username");
		String email = properties.getProperty("email");

//		in the above 3 lines of code we are repeatig the code what of 10000 datas are there so
		// use for lopp
		for (String key : properties.stringPropertyNames()) {// based on the key
			System.out.println(key + " " + properties.getProperty(key));// printing key along with the value
		}

		System.out.println("name: " + name + ", email: " + email + ", mobile: " + mobile);

		// captire all the key properties(one way )
		Set<String> keys = properties.stringPropertyNames();
		System.out.println(keys);

		// captire all the key properties(2nd way )
		Set<Object> allKeys = properties.keySet();
		System.out.println(allKeys);

		// captire all the values properties(2nd way )
		Collection<Object> values = properties.values();// collection of objects
		System.out.println(values);
	}

}
