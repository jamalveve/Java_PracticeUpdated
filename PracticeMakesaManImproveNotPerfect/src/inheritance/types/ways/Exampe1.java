package inheritance.types.ways;

public class Exampe1 {

	public static void main(String[] args) {
ClassTwo secondclassp= new ClassTwo();
System.out.println(secondclassp.i);
System.out.println(secondclassp.j);
	}

}
class ClassOne
{
    static int i = 111;
 
    int j = 222;
 
    {
        i = i++ - ++j;
    }
}
 
class ClassTwo extends ClassOne
{
    {
        j = i-- + --j;
    }
}
