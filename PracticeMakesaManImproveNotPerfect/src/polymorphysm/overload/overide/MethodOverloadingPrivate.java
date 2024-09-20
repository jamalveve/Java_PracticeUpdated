package polymorphysm.overload.overide;

public class MethodOverloadingPrivate {

	public static void staticMethodOVerloadings(String studentName, String degree, int rollnumber, double mobilenumber) {
		System.out.println("list of student who have all four " + studentName + degree + rollnumber + mobilenumber);
	}

	private static void staticMethodOVerloadings(String studentName, String degree, int rollnumber) {
		System.out.println("list of student who have all three " + studentName + degree + rollnumber);
	}

	 private static void staticMethodOVerloadings(String studentName, int rollnumber) {
		System.out.println("list of student who have only two " + studentName + rollnumber);
	}

	public static int staticMethodOVerloadings(int rollnumber) {
		System.out.println("I am as studen only wigth roll nuber:"+rollnumber);
		return rollnumber;

	}

	public static void display1() {
		System.out.println("displaying students data");
		staticMethodOVerloadings(5678);
	}
	
	public static void main(String[] args) {
		MethodOverloadingPrivate obj1=new MethodOverloadingPrivate();
		obj1.display1();
		//we can call classname with member name


		MethodOverloadingPrivate.staticMethodOVerloadings(6756);
		MethodOverloadingPrivate.staticMethodOVerloadings("jamal"," be cse",1453,7.70);
		MethodOverloadingPrivate.staticMethodOVerloadings("abi"," be civil",1675);
		MethodOverloadingPrivate.staticMethodOVerloadings("venky", 1789);
//		
//		obj1.MethodOVerloading(6756);
//		obj1.MethodOVerloading("jamal"," be cse",1453,7.7);
//		obj1.MethodOVerloading("abi"," be civil",1675);
//		obj1.MethodOVerloading("venky", 1789);
	}

}
