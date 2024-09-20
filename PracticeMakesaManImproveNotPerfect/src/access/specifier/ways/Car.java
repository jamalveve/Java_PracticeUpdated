package access.specifier.ways;

public class Car {

	//public  methods
	public static void car1() {
		System.out.println("hi I a, a public static void method from different class");

	}

	public static int car2(int a, int b) {
		System.out.println("hi Im a public static returntype method from different class");
		return a + b;

	}

	public void car3() {
		System.out.println("hi Im a public nonstatic void method from different class");

	}

	public String car4(String name) {
		System.out.println("hi Im a public nonstatic return type method from different class");
		return name;

	}

	//prptected methods
	protected static void cars1() {
		System.out.println("hi I a, a public static void method from different class");

	}

	protected static int cars2(int a, int b) {
		System.out.println("hi Im a public static returntype method from different class");
		return a + b;

	}

	protected void cars3() {
		System.out.println("hi Im a public nonstatic void method from different class");

	}

	protected String cars4(String name) {
		System.out.println("hi Im a public nonstatic return type method from different class");
		return name;

	}

	
	//default methods->package private
		 static void carss1() {
			System.out.println("hi I a, a public static void method from different class");

		}

		static int carss2(int a, int b) {
			System.out.println("hi Im a public static returntype method from different class");
			return a + b;

		}

		 void carss3() {
			System.out.println("hi Im a public nonstatic void method from different class");

		}

		 String carss4(String name) {
			System.out.println("hi Im a public nonstatic return type method from different class");
			return name;

		}

}
