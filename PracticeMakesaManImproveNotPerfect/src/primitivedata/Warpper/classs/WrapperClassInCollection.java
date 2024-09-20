package primitivedata.Warpper.classs;

import java.util.ArrayList;

public class WrapperClassInCollection {

	public static void main(String[] args) {
		
		ArrayList listofHetrogenious =new ArrayList<>();
		//heterogenious 
		listofHetrogenious.add("jamall");
		listofHetrogenious.add(67);
		listofHetrogenious.add(0.49);
		listofHetrogenious.add(7890.987f);
		listofHetrogenious.add(7890890L);
		
		for(Object obj:listofHetrogenious) {
			System.out.println(obj);
		}

		
		//but homogeneous
		ArrayList<Integer> listofHomo =new ArrayList<>();
//		The Integer her is wrapperclass
		
		
	}

}
