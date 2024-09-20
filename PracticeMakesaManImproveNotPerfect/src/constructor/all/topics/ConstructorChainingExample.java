package constructor.all.topics;

public class ConstructorChainingExample extends SuperConstructorChaining{
	int constvar1;
	String constvar2;
	private double constVar3;
	//reverse chaining
	public ConstructorChainingExample() {
		this("jamal",14);
		System.out.println("zero param cons");
	}
	public ConstructorChainingExample(String constvar2,int constvar1) {
		this("jamal",14,8.9);
		this. constvar1= constvar1;
		this. constvar2= constvar2;
		System.out.println("two param cons");
	}
	public ConstructorChainingExample(String constvar2,int constvar1,double constVar3) {
		this(0.76);
		this. constvar1= constvar1;
		this. constvar2= constvar2;
		System.out.println("three param cons");
	}
	public ConstructorChainingExample(double constvar3) {
		super();
		this. constVar3= constvar3;
		System.out.println("single param cons");
	}
}
