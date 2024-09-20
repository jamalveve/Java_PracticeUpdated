package inheritance.types.ways;

class Superclass {
    // Instance initialization block in superclass
    {
        System.out.println("Superclass instance initialization block");
    }
    
    // Constructor of superclass
    public Superclass() {
        System.out.println("Superclass constructor");
    }
    
    // Parameterized constructor of superclass
    public Superclass(String message) {
        System.out.println("Superclass constructor with message: " + message);
    }
}

class Subclass extends Superclass {
    // Instance initialization block in subclass
    {
        System.out.println("Subclass instance initialization block");
    }
    
    // Constructor of subclass
    public Subclass() {
//        super("Hello from Subclass");  // Explicitly calling the parameterized constructor of Superclass
        System.out.println("Subclass constructor");
    }
}

public class Test1 {
    public static void main(String[] args) {
        new Subclass();
    }
}

