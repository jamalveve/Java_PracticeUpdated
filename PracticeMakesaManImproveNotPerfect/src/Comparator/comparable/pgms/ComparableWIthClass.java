package Comparator.comparable.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableWIthClass {

	public static void main(String[] args) {
		List<Students> studentList = new ArrayList<>();
		studentList.add(new Students(23, "jamal"));
		studentList.add(new Students(25, "shimra"));
		studentList.add(new Students(20, "kiara"));

////			System.out.println(studentList);//studentList is not a varibale
		System.out.println("printing before sorting");
		for (Students StudentsObj : studentList) {
			System.out.println(StudentsObj);
		}
//			even though you implemented comparable still you ca  use comparator also no pbm
//			
//			Comparator<Students> CustomComparator=new Comparator<Students>() {
//
//				@Override
//				public int compare(Students o1, Students o2) {
//					if(o1.age>o2.age) {
//						return 1;
//					}else {
//						return -1;
//					}
//				}
//				
//			};
		System.out.println("printing after sorting");
		Collections.sort(studentList);
		for (Students StudentsObj : studentList) {
			System.out.println(StudentsObj);
		}
	}

	// TODO Auto-generated method stub

}

class Students implements Comparable<Students> {
	// if you want to give a power to class itself to compare the object
	int age;
	String name;

	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Students[ age= " + age + ", name= " + name + " ]";
	}

	@Override
	public int compareTo(Students that) {
		if (this.age > that.age) {
			return 1;
		} else {
			return -1;
		}

	}

}