package Comparator.comparable.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//public class ComparatorWithCollections implements Comparable<Integer>{
public class ComparatorWithCollections {

	public static void main(String[] args) {

		List<Integer> listoInteger = new LinkedList<>();
		listoInteger.add(23);
		listoInteger.add(13);
		listoInteger.add(30);
		listoInteger.add(45);
		listoInteger.add(10);

		System.out.println("printing all together: " + listoInteger);
		System.out.println("printing one by one");
		for (Integer numbers : listoInteger) {
			System.out.println(numbers);
		}
		Collections.sort(listoInteger);
		System.out.println("printing one by one after sorting");
		for (Integer numbers : listoInteger) {
			System.out.println(numbers);
		}
		Comparator<Integer> customlogic = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {// if you give int 01,int o2 it wull show compile error bcx
														// collections work with wrapper class not data type
				if (o1 % 10 > o2 % 10) {
					return 1;
				} else
					return -1;
			}

		};
		Collections.sort(listoInteger, customlogic);
		System.out.println("printing one by one after custom sorting using comparator");
		for (Integer numbers : listoInteger) {
			System.out.println(numbers);
		}

		Set<String> setofStrins = new LinkedHashSet<>();
		setofStrins.add("jamhyy");
		setofStrins.add("kiora");
		setofStrins.add("bijuu");
		setofStrins.add("camy");
		setofStrins.add("haryys");
		setofStrins.add("lavanya");

		System.out.println("printing all together: " + setofStrins);
		System.out.println("printing one by one");
		for (String str : setofStrins) {
			System.out.println(str);
		}

//		Collections.sort(setofStrins);//sort will work only for list so
		// we can convert it to list and and do natural sort
		// or wecan convert ot to list do some comparator custom sort
		// or we can use tree set to implment natural sort
		// bit what we need to sort hashet not possible
		// you can convert it to treeset and we havesue comparator constructor in treeset use that
		Set<String> treeSet = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// Example: sort by length, then alphabetically

				int lengthCompare = Integer.compare(o1.length(), o2.length());
				if (lengthCompare != 0) {
					return lengthCompare;
				}
				return o1.compareTo(o2);
			}

		});
		treeSet.addAll(setofStrins);
		System.out.println("printing all together: " + treeSet);
		System.out.println("printing one by one");
		for (String str : treeSet) {
			System.out.println(str);
		}
		//above insted of printing the treeset directly you can create a
		//mew linked hashet which take collection constrcrtor to impement a sorted set
		 Set<String> sortedLinkedHashSet1 = new LinkedHashSet<>(treeSet);
		 System.out.println("sortedLinkedHashSet using treeset: "+sortedLinkedHashSet1);
		 
		
		  // Convert LinkedHashSet to List and doing sort
        List<String> list = new ArrayList<>(setofStrins);

        // Sort the List using a custom Comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Example: sort by length, then alphabetically
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                return s1.compareTo(s2);
            }
        });

        // Create a new LinkedHashSet to maintain sorted order
        Set<String> sortedLinkedHashSet = new LinkedHashSet<>(list);

        // Print the sorted LinkedHashSet
        System.out.println("Sorted LinkedHashSet using list: " + sortedLinkedHashSet);

	}//try in map alsp

//@Override
//public int compareTo(Integer that) {
////	if(this.>that.)//not a proper way bcif you check The INteger class /String class it is alread implementing the comparable interface
////		s?directly take the Collections.sort()
//}//so in this case if you  want anhy custom order go for a comparator
}
