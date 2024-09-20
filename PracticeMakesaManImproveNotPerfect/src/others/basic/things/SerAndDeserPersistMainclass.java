package others.basic.things;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerAndDeserPersistMainclass {

	public static void main(String[] args) {
		  try{    
			  
			   System.out.println("Current Directory: " + System.getProperty("user.dir"));
			  //Creating the object    
			  SerializationExampleStudent s1 =new SerializationExampleStudent(211,"ravi");    
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("serializationWriting.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("successfully writed the mesage");   
			  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("serializationWriting.txt"));  
			  SerializationExampleStudent s=(SerializationExampleStudent)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  
			  System.out.println("successfully readed  the mesage");  
			  
			  
			  }catch(Exception e){System.out.println(e);}    
			 }   
	
	

	}

