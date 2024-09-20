package others.basic.things;

import java.io.Serializable;

public class SerializationExampleStudent implements Serializable{  
		 int id;  
		 transient String name;  //it womt serialize
		 public SerializationExampleStudent(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
		 }  
}
