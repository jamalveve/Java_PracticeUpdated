package string.builder.buffer;

public class ReverseExample {

	public static void main(String[] args) {

		// we dont have reverse method in string so we have to do it manually
		// approcah 1
		String s1 = "welcome";
		String revString = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			revString = revString + s1.charAt(i);
//			;
//		}
//		System.out.println(revString);

		// approach 2
		char array1[] = s1.toCharArray();
//		System.out.println(array[0]);
		for (int i = array1.length - 1; i >= 0; i--) {
			revString += array1[i];
		}
		System.out.println(revString);

	StringBuffer strbuff=new StringBuffer("welcome");
	System.out.println(strbuff.reverse());
	}
	  
}
