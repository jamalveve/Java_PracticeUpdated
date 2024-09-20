package thisandsuper.statement.keyword;

//constructor level
public class StudentExample {
	int maxspeed = 56;
	String active;
	float meteres;
	String name;

	StudentExample(String active, float anothername, String names) {
//		this();//it is not [ossible it woll shpw com[piler error//Recursive constructor invocation
		// recursive constructor invocation means->ulta invocation now paremeterised is
		// passsed inside below constructor
		// and now that constructpr we re trying to invoke in this construcpot->not possible

		// constructor level this statement
		this.active = active;// if we didnot use this here it will assign its default value 0 for int null
								// for string
		meteres = anothername;// noneed of this here as it is completly diffrent variable
		this.name = names;// any variable is fine to give in the print statment local or global
		System.out.println("active " + active + meteres + names);

	}

	StudentExample() {
		this("jamal", 4.5f, "active");// invoking param constrctor from 0 param constructor
		System.out.println(" zero param constructor from parent");

	}

	StudentExample(String abc, String cde) {
		this();// invoking 0 param constrctor from param constructor
		this.active=abc;
		this.name=cde;
		System.out.println(" param constructor giving" + abc + cde + "from super statemente parameter");
	}

	void method() {
		System.out.println("paremetrtsised contrucot for this keyword use: " + active + meteres);
		System.out.println("some void method from parent");
	}

	void parmeterisedMethod(int a, int b) {
		System.out.println(a + b);
	}
	StudentExample methods() {
		return this;
	}


}

class ChildClassforStudent extends StudentExample {

	int maxspeed = 906;

	ChildClassforStudent() {
		super("jamal", "some");
		System.out.println("the above statement is print from child class super(3,5)");
		ChildClassforStudent(this);
//		super();//only one statemntvshoudl be there

	}

	ChildClassforStudent(int a) {

		super();// super keywprd in constructor level
		System.out.println("from one more constructor in child class printing" + a);
		this.method();// invoking the method in the class level
	
	}

	protected void ChildClassforStudent(ChildClassforStudent reference) {
//		this.maxspeed;//not possoble variable level only methid level
		System.out.println("protected void constructor take constructor and refrence as parameter");
		methodsExtra(this);
		methodsExtraforObj(this);
	}

	void method() {
//		super();//cant state in method be there
		System.out.println("some void method from child");
	}

	void display() {
		super.method();/// super keyword in method level
		// super keyword in variable level
		System.out.println("max speed from parent class using super keyword in variable" + super.maxspeed);
	}

	void methodforChild() {
		System.out.println("some void method for child");
	}

	private void methodsExtra(ChildClassforStudent refe) {
		System.out.println("private void constructor take constructor and refrence as parameter");

	}
	private void methodsExtraforObj(Object obj) {
		System.out.println("private void methods take objectclass and refrence as parameter");

	}
	protected void methodfoObj(Object obj) {
		System.out.println("Object class callig");
	}

}