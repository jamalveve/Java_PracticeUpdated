package polymorphysm.overload.overide;

public class MethodOVerloadingExample {

	public static void staticMethodOVerloading(String studentName, String degree, int rollnumber, double mobilenumber) {
		System.out.println("list of student who have all four " + studentName + degree + rollnumber + mobilenumber);
	}

	protected static void staticMethodOVerloading(String studentName, String degree, int rollnumber) {
		System.out.println("list of student who have all three " + studentName + degree + rollnumber);
	}

	 static void staticMethodOVerloading(String studentName, int rollnumber) {
		System.out.println("list of student who have only two " + studentName + rollnumber);
	}

	public static void staticMethodOVerloading(int rollnumber) {
		System.out.println("list of student who have ionly one " + rollnumber);
	}

	public static void display1() {
		System.out.println("displaying student data");
	}
	/////////////////////////////////////////////////////////////////////////////////
	public  void MethodOVerloading(String studentName, String degree, int rollnumber, double mobilenumber) {
		System.out.println("list of student who have all four " + studentName + degree + rollnumber + mobilenumber);
	}

	protected  void MethodOVerloading(String studentName, String degree, int rollnumber) {
		System.out.println("list of student who have all three " + studentName + degree + rollnumber);
	}

	public  void MethodOVerloading(String studentName, int rollnumber) {
		System.out.println("list of student who have only two " + studentName + rollnumber);
	}

	  void MethodOVerloading(int rollnumber) {
		System.out.println("list of student who have ionly one " + rollnumber);
	}

	public void display2() {
		System.out.println("displaying student data");
	}
}
