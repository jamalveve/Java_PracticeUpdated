package map.interfaceI.concepts;

import java.util.HashMap;

public class HashMapCollisonExample {

	    public static void main(String[] args) {
	        // Create a HashMap instance
	        HashMap<Person, String> map = new HashMap<>();

	        // Create instances of the Person class
	        Person p1 = new Person(1, "Alice");
	        Person p2 = new Person(2, "Bob");
	        Person p3 = new Person(1, "Charlie"); // Collision with p1
	        Person p4 = new Person(1, "Dave");    // Collision with p1
	        Person p5 = new Person(1, "Eve");     // Collision with p1

	        // Adding entries to the map
	        map.put(p1, "Student A");
	        map.put(p2, "Student B");
	        map.put(p3, "Student C"); // This will cause a collision
	        map.put(p4, "Student D"); // This will cause another collision
	        map.put(p5, "Student E"); // This will cause yet another collision

	        // Output the HashMap entries
	        System.out.println("HashMap Entries:");
	        for (Person key : map.keySet()) {
	            System.out.println(key + " : " + map.get(key));
	        }

	        // Accessing collided keys
	        System.out.println("\nRetrieved value for key p1: " + map.get(p1));
	        System.out.println("Retrieved value for collided key p3: " + map.get(p3));
	        System.out.println(p3.hashCode());
	        System.out.println(p4.hashCode());
	    }
	}

	class Person {
	    private int id;
	    private String name;

	    public Person(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Custom hashCode method that causes collisions
	    @Override
	    public int hashCode() {
	        return id; // All persons with the same id will produce the same hashCode
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Person)) return false;
	        Person other = (Person) obj;
	        return this.id == other.id && this.name.equals(other.name);
	    }

	    @Override
	    public String toString() {
	        return id + " - " + name;
	    }
	}
