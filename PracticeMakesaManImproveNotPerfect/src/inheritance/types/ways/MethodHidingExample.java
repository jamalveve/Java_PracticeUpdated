package inheritance.types.ways;

//class Parent {
//    // Static method in the parent class
//    static void staticMethod() {
//        System.out.println("Static method in Parent class.");
//    }
//    
//    // Instance method in the parent class
//    void instanceMethod() {
//        System.out.println("Instance method in Parent class.");
//    }
//}

class Child extends MethodHidingExample {
    // Static method in the child class hiding the static method in the parent class
    static void staticMethod() {
        System.out.println("Static method in Child class.");
    }
    
    // Instance method in the child class
    void instanceMethod() {
        System.out.println("Instance method in Child class.");
    }
    static void StaticmethodTwo() {
    	System.out.println("I ma one more static mehod in child class I am not  overided any parent");
    }
    void instanceMethodTwo() {
        System.out.println("I ma one more instance mehod in child class I am not  overided any parent");
    }
    
}

public class MethodHidingExample {
	
//	  Static method in the parent class
  static void staticMethod() {
      System.out.println("Static method in Parent class.");
  }
  
  // Instance method in the parent class
  void instanceMethod() {
      System.out.println("Instance method in Parent class.");
  }
  
  static void staticMethodextra() {
      System.out.println("Static extra method in Parent class.");
  }
  void instanceMethodExtra() {
      System.out.println("Instance extra method in Parent class.");
  }
    public static void main(String[] args) {
    	System.out.println("============parent obj==============");
        MethodHidingExample parent = new MethodHidingExample();
        parent.instanceMethod();    // Outputs: Instance method in Parent class.
parent.staticMethod();
parent.staticMethodextra();
parent.instanceMethodExtra();
System.out.println("============child obj==============");

Child child=new Child();
child.instanceMethod();
child.staticMethod();
child.StaticmethodTwo();
child.instanceMethodTwo();
child.instanceMethodExtra();//parents
child.staticMethodextra();//parents

System.out.println("============upcasting ==============");

MethodHidingExample childAsParent = new Child();//upcasting
childAsParent.instanceMethod(); // Outputs: Instance method in Child class.
childAsParent.staticMethod();//output: static method in parent class
//childAsParent.StaticmethodTwo();//he cant call 
//childAsParent.instanceMethodTwo();cant call
System.out.println("I cant call nonoverided static and non static method from childc class");
childAsParent.instanceMethodExtra();
childAsParent.staticMethodextra();




        // Calling static methods
//    	MethodHidingExample.staticMethod(); // Outputs: Static method in Parent class.
//        Child.staticMethod();  // Outputs: Static method in Child class.
//
//        // Creating instances to call instance methods
//         // Upcasting
//
//        childAsParent.instanceMethod(); // Outputs: Instance method in Child class.
//        childAsParent.instanceMethod();
        // Note: Static methods cannot be called on instance references.
        // So the following lines would be incorrect:
//        when you do upcast-> both will call paranet method only unless it is a nonstatic metod
        // parent.staticMethod();    // This will call Parent's staticMethod
        // childAsParent.staticMethod(); // This will also call Parent's staticMethod
   
//    wheny you ard doing upocasting ->if it non static->child method
//        if it i static parent method
    
    
    }
}
