package abstraction.abstracts.topic;

public class AbstractMainClass {
	public static void main(String[] args) {
		//cant instatntiate the abstract class
//		AbstractClassExample absobj=new AbstractClassExample() ;
		//child class
		Carss classobj=new Carss("kind",5);
//		Carss classobj1=new Carss("kind",5,78);
		
		classobj.engine();
		System.out.println("car will have tiers count: "+classobj.tire());
		AbstractClassExample.method3();//clasname.memeber name
		System.out.println(classobj.Cardetails(" uyunovo", " DF-5647"));
		classobj.finalmethod4();
		//classobj.names="jamal"; cant modify
		classobj.finalparameterisedmethod4(54,"abccccc");
		classobj.nonstaticmethod();

		
		

	}
}
	