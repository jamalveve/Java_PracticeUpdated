package inheritance.types.ways;

public class InstanceBlock {

	public static void main(String[] args) {

        C200 c = new C200();
// block will come from top
        
//        A200 a=new A200();
//        //in instanc if you call that parent pareny only will come
//        
//        B200 b=new B200();
//        //1 and 2
	}

}
class A200
{
    {
        System.out.println(1);
    }
}

class B200 extends A200
{
	int x =876;
//    {	
    
//        System.out.println(x);//if no insrance block it wonr print 876
//    }
}
 
class C200 extends B200
{
	int x=45;

    {
        System.out.println(x);	
    }
}

