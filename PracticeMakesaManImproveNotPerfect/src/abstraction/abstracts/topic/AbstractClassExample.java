package abstraction.abstracts.topic;

public abstract class AbstractClassExample {

	// abstatct classes can have abstract method and deafault method
	// if any class contains one abstractmeyhod means also the class should be
	// declard as abstract
	final String names = "maruthi";
	private final String kind;// only in consyructor declaration is possible
	 final int abc;//eother init/declare inside construtor
	private final int def=35;
	static int statvar;
	AbstractClassExample(String kind) {
//		this("king",56);Y not possible
		abc=59;//we can initialoize final varible  only in constructor 
//		def=def+78+abc;//not possible
		this.kind = kind;
		System.out.println(kind);
		System.out.println(abc);

	}
	AbstractClassExample(String kind,int statvar) {
//		this("jamal");
		abc=78;
		this.statvar=statvar;
		this.kind = kind;
		System.out.println(kind);
		System.out.println(abc);
		System.out.println(statvar);

	}
     AbstractClassExample(String kind,int statvar,int abc) {
		
		this.statvar=statvar;
		this.kind = kind;
		this.abc=abc;
		System.out.println(kind);
		System.out.println(abc);
	 System.out.println(statvar);

	}
	
	abstract void engine();

	abstract int tire();

	abstract String Cardetails(String carName, String carmodel);

	public static void method3() {//public /protectred/default methods
		System.out.println("I a, default method in abstract class");
		int abc=67;
		int def=78+abc;
		System.out.println(abc);
		System.out.println(def);

	}
	
  void nonstaticmethod() {
	System.out.println("i am from abstract nonstatuc method");
}
	final void finalmethod4() {
		System.out.println("I am final method in abstract class");
	}// you cant overide

	final void finalparameterisedmethod4(int abc, String adress) {
		System.out.println("I am final method in abstract class giving two parameter" + abc + adress);
	}// y
}

class Carss extends AbstractClassExample {

	Carss(String name, int some) {
		super("kindhearted",56,35);// super statemnt in constructor first line

		System.out.println(name + some);
	}

	@Override
	void engine() {
		System.out.println("cars will have a ANC engine");
	}

	@Override
	int tire() {
		return 4;
	}

	@Override
	String Cardetails(String carName, String carmodel) {

		return "CardDetails:CarName is" + carName + "carmodel is" + carmodel;
	}

}
