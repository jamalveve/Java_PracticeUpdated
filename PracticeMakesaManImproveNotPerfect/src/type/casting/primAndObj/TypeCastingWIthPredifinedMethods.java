package type.casting.primAndObj;

public class TypeCastingWIthPredifinedMethods {

	public static void main(String[] args) {

////		ex 1
//		Object o =new String("welcome");
//		StringBuffer strnbuff=(StringBuffer)o; // rule 1 is fine ,rule 2 fine,rule 3 fails
//		
//		String str=new String("hello");
//		StringBuffer strbff2=(StringBuffer)str;//rule 1 only failed
//		
//		Object obj=new String("Hlloohai");
//		StringBuffer stb=(StringBuffer) obj;//rule 1 fine, rule 2 fine.rule 3 fails
//		
//	
//		Object obj2=new String("excusme");
//		StringBuffer strbd=(String)obj2;//rule 1 fine,rule 2 failed 
//		
//		String str1=new String("hello"); //rule 1 fine ,rule2 failed,
//		StringBuffer strbdo=(String)str1; 
//		
//		Object obj4=new String("excusme");
//		StringBuffer strbds=(StringBuffer)obj2;//rule 1 fine,rule 2 fine,rule 3 failed
	
		Object obj5=new String("excusme");
		String s2=(String)obj5;//rule 1 fine,rule 2 fine,rule 3 fine bcz same 
	System.out.println(s2);
	
	}

}
