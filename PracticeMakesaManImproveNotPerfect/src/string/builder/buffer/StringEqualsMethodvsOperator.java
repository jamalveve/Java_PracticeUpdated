package string.builder.buffer;

public class StringEqualsMethodvsOperator {

	public static void main(String[] args) {

		String s1="hi";
		String s2="hi";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		
		String s3="hi";
		String s4=new String("hi");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

		
		String s5=new String("hi");
		String s6=new String("hi");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		
		String s7=s6;
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		System.out.println(s7==s5);
		System.out.println(s5.equals(s7));

		String s8=s5;
		System.out.println(s5==s8);
		System.out.println(s5.equals(s8));
		System.out.println(s6==s8);
		System.out.println(s6.equals(s8));

		
//		String s1="hi";
//		String s2="hi";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//
//		
//		String s1="hi";
//		String s2="hi";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));

	}

}
