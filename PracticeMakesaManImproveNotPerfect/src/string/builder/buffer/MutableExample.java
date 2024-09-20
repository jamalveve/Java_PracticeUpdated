package string.builder.buffer;

public class MutableExample {

	public static void main(String[] args) {

		StringBuilder strbuilder=new StringBuilder("welcome");
		strbuilder.append("to my home");
		System.out.println(strbuilder);
		
		StringBuffer strbuffer=new StringBuffer("welcome");
		strbuffer.append("to my home");
		System.out.println(strbuffer);
		
//		so what is the difference 
		//memory wise difference
		//but user level it is same
	}

}
