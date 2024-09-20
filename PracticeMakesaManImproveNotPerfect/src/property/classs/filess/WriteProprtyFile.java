package property.classs.filess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProprtyFile {

	public static void main(String[] args)  throws IOException{
		Properties properties=new Properties();
		
		//must be key and value
		properties.setProperty("username", "jamal");
		properties.setProperty("email", "jamu");
		properties.setProperty("mobile", "897865757");
		
		String filepath=System.getProperty("user.dir")+"\\data\\example.properties";
		//FileOutputStream will open the file in reading mode so that we can write back in to the file
		//we want to create a new file and inside that we have to pass the data
		//writing the data -FOS
		//reading  the data-FIS
		FileOutputStream file=new FileOutputStream(filepath);
		properties.store(file,"sample datain properties file..");
		
		file.close();
		System.out.println("prpperties have been wriiten to "+filepath);
		
	}

}
