package inheritance.types.ways;

public class StaticBlockExample {
	
//	Astatic objA=new Astatic();
	
//	Bstatic objB=new Bstatic();
	
	Cstatic obj=new Cstatic();

}
class Astatic
{
   static{
        System.out.println(1);
    }
}
 
class Bstatic extends Astatic
{
//	int x=10;//cant make a non static to static 
	static int x=10;
	static {
        System.out.println(x);
		System.out.println(2);
    }
}
 
class Cstatic extends Bstatic
{
	static int x=20;
	static {
        System.out.println(x);

        System.out.println(3);
    }
}
