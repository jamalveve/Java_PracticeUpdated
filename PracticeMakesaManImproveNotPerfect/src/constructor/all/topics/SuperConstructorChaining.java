package constructor.all.topics;

public class SuperConstructorChaining {
	int superconstvar1;
	String superconstvar2;
	private double superConstVar3;
	//actuall order chaining
	public SuperConstructorChaining() {
		this("jamal",14);
		System.out.println("zero param cons from super constructor");
	}
	private SuperConstructorChaining(String superconstvar2,int superconstvar1) {
		this("jamal",14,8.9);
		this. superconstvar1= superconstvar1;
		this. superconstvar2= superconstvar2;
		System.out.println("two param cons");
	}
	public SuperConstructorChaining(String superconstvar2,int superconstvar1,double superConstVar3) {
		
		this(3.4);
		this. superconstvar1= superconstvar1;
		this. superconstvar2= superconstvar2;
		System.out.println("three param cons from super constructor");
	}
	public SuperConstructorChaining(double superConstVar3) {
		
		this. superConstVar3= superConstVar3;
		System.out.println("single param cons from super constructor");
	}

}
