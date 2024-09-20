package others.basic.things;

public class CommonClass {

	public static void main(String[] args) {
		VariablesAndMethodsMain objss=new VariablesAndMethodsMain();
		System.out.println(objss.variable2);
//		System.out.println(objss.variable3);//private
		System.out.println(objss.variable5);
		System.out.println(objss.globalvar1);

		System.out.println(objss.variable7);
		System.out.println(VariablesAndMethodsMain.variable8);
		System.out.println(VariablesAndMethodsMain.variable1);

		System.out.println(VariablesAndMethodsMain.variable6);
		
		objss.nonSTaticmethod();
        VariablesAndMethodsMain.sTaticmethod();
        VariablesAndMethodsMain.finalmethod();
       
//Strings topic
        
StringClassExample stringobj=new StringClassExample();
stringobj.method();
		

	}

}
