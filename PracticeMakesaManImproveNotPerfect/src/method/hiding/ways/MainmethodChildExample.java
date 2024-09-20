package method.hiding.ways;

public class MainmethodChildExample extends MainmethodParentExample {
//public static void main(String[] args) {
//	System.out.println("hello I am from extra main method");
//}
//	if it is not static
	public void main() {
		System.out.println("Hi I am from first nonstatic child method");
	}
}
