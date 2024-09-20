package method.hiding.ways;

public class ClassAnimal {

	static void sound() {
		System.out.println("animal sounds bad");
	}
     void eat() {
		System.out.println("animal eats ");
	}
     void oneMethod() {
    	 System.out.println("one new metyhod from parent");
     }
	
}
class Tiger extends ClassAnimal{
	
	static void sound() {
		System.out.println("Tiger sounds bad");
	}
	void eat() {
		System.out.println("tiger eats anything");
	}
//	static void oneMethod() {
//   	 System.out.println("one new metyhod from parent");
//    }
}
