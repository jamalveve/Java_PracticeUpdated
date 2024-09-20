package Comparator.comparable.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorWithClass {
	//comparator is like if you want to specify on which logic you want to sort elements  ( custom sorting )+
	public static void main(String[] args) {
		List<Person> personList=new ArrayList<>();
		personList.add(new Person(23,"jamal"));
		personList.add(new Person(25,"shimra"));
		personList.add(new Person(20,"kiara"));
		
		
//		System.out.println(PersonList);//personlist is not a varibale
	System.out.println("printing before sorting");
		for(Person personObj:personList) {
			System.out.println(personObj);
		}
		
		System.out.println("printing after sorting");
		Comparator<Person> CustomComparator=new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.age>o2.age) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		Collections.sort(personList,CustomComparator);
		for(Person personObj:personList) {
			System.out.println(personObj);
		}
	}
	

}

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Person[ age= " + age + ", name= " + name + " ]";
	}
}
