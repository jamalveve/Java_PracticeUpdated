package constructor.all.topics;

public class PrivatCheckforConstructor {
	int variablessss;
	private String stringVariablk;

	public PrivatCheckforConstructor(int variablessss, String stringVariablk) {
		this.stringVariablk = stringVariablk;
		this.variablessss = variablessss;
		System.out.println(variablessss+stringVariablk);

	}

	private PrivatCheckforConstructor(int variablessss) {
		this.variablessss = variablessss;
		System.out.println(variablessss);

	}

	public PrivatCheckforConstructor() {
		System.out.println("zero param");
	}

	public static void main(String[] args) {
		PrivatCheckforConstructor obj=new PrivatCheckforConstructor();
		PrivatCheckforConstructor obj2=new PrivatCheckforConstructor(77);
		PrivatCheckforConstructor obj3=new PrivatCheckforConstructor(89,"huedhwmj");

		Childconstructor constchild=new Childconstructor(2);
		Childconstructor constchil=new Childconstructor(2,5);
	}

}
class Childyyy extends PrivatCheckforConstructor{
	
}
class Childconstructor extends PrivatCheckforConstructor{
	int a;
	int b;
	Childconstructor(int a,int b){
		this.a=a;
		this.b=b;
	}
	protected Childconstructor(int b){
		this.b=b;

		
	}
	
}