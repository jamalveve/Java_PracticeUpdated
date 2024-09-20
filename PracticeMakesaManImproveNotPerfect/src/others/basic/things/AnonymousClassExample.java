package others.basic.things;

public class AnonymousClassExample {

	public static void main(String[] args) {
		Person personobj = new Person() {
			void eat() {
				System.out.println("person from mainclass is eating");
			}

			void eatableInterface() {
				System.out.println("person from mainclass is eating");
			}

			protected void drink() {
				System.out.println("person from mainclass  is eating");
			}

//			static void play() {
//				System.out.println("person from mainclass  is eating");
//			}

			void study(String study) {
				System.out.println("person from mainclass is studying" + study);
			}
//			void giveableInterface() {
//				System.out.println("person from mainclass is studying"+whatss);
//
//			}

		};
		personobj.eat();
		personobj.drink();
		Person.play();
		personobj.study("Java");
//		personobj.
		
//		AnonymousInterfaceExample interfaceobj = new AnonymousInterfaceExample() ;//not possible

		AnonymousInterfaceExample interfaceobj = new AnonymousInterfaceExample() {
			@Override
			public void eatableInterface() {
				System.out.println("interface non static methods");
			}

			@Override
			public void giveableInterface(String whats) {
				System.out.println("interface non static methods" + whats);
			}
		};

		interfaceobj.eatableInterface();
		interfaceobj.giveableInterface("something interfcae");
	}

}

class Person {
	void eat() {
		System.out.println("person is eating");
	}

	protected void drink() {
		System.out.println("person is eating");
	}

	static void play() {
		System.out.println("person is eating");
	}

	void study(String study) {
		System.out.println("person is studying" + study);
	}

	{
		{
			System.out.println("anonymous class using double braces");
		}
	}
}