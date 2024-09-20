package constructor.all.topics;

public class ShallowCopyExample {
	  private String name;
	    private String address; // Reference to mutable object

	    public ShallowCopyExample(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }

	    // Shallow copy constructor is same as copy constructor
	    public ShallowCopyExample(ShallowCopyExample other) {
	        this.name = other.name;
	        this.address = other.address; // Copying the reference (shallow copy)
	    }
	    public void display() {
			System.out.println("my name" + name + " with in" + address + " my adress");
		}
}
class ABC  
{  
// instance variable of the class ABC  
int x = 30;  
}  

