package map.interfaceI.concepts;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	    public static void main(String[] args) {
	        // Create a TreeMap instance
	        TreeMap<String, Integer> treeMap = new TreeMap<>();
	        
	        // Adding entries to the TreeMap
	        treeMap.put("Apple", 50);
	        treeMap.put("Banana", 30);
	        treeMap.put("Cherry", 75);
	        treeMap.put("Blubeery", 75);
	        treeMap.put("Date", 20);
	        treeMap.put("Elderberry", 100);
	        
	        // Displaying the TreeMap
	        System.out.println("TreeMap entries:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        // Accessing specific elements
	        System.out.println("\nSpecific elements:");
	        System.out.println("Apple: " + treeMap.get("Apple"));  // Get value associated with key "Apple"
	        System.out.println("Banana: " + treeMap.get("Banana")); // Get value associated with key "Banana"
	        
	        // Removing an entry
	        treeMap.remove("Date");
	        System.out.println("\nTreeMap after removing 'Date':");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        // Getting the first and last keys
	        System.out.println("\nFirst and last keys:");
	        System.out.println("First key: " + treeMap.firstKey());
	        System.out.println("Last key: " + treeMap.lastKey());
	        
	        // Getting a submap
	        System.out.println("\nSubmap from 'Banana' to 'Elderberry':");
	        SortedMap<String, Integer> subMap = treeMap.subMap("Banana", "Date");
	        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        // Getting the highest and lowest values less than or equal to a given key
	        System.out.println("\nClosest lower or equal and higher or equal keys:");
	        System.out.println("Floor key of 'Cherry': " + treeMap.floorKey("Cherry"));
	        System.out.println("Ceiling key of 'Cherry': " + treeMap.ceilingKey("Cherry"));
	        
	        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
	     // Iterate and perform operations
	        while (iterator.hasNext()) {
	            Map.Entry<String, Integer> entry = iterator.next();
	            
	            // Print the key and value
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	            
	            // Example operation: Remove an entry based on a condition
	            if (entry.getValue() < 50) {
	                iterator.remove(); // Remove entries with values less than 50
	            }
	    }
	        // Print the TreeMap after removal
	        System.out.println("\nTreeMap after removal of entries with values less than 50:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	        
	       
	     // Check if specific keys and values are present
	        String keyToCheck = "Banana";
	        Integer valueToCheck = 75;
	        
	        // Check if the key is present
	        if (treeMap.containsKey(keyToCheck)) {
	            System.out.println("The key '" + keyToCheck + "' is present in the TreeMap.");
	        } else {
	            System.out.println("The key '" + keyToCheck + "' is not present in the TreeMap.");
	        }
	        
	        // Check if the value is present
	        if (treeMap.containsValue(valueToCheck)) {
	            System.out.println("The value '" + valueToCheck + "' is present in the TreeMap.");
	        } else {
	            System.out.println("The value '" + valueToCheck + "' is not present in the TreeMap.");
	        }
	        
	        // Perform an operation based on key presence
	        if (treeMap.containsKey("Cherry")) {
	            // Update the value associated with the key "Cherry"
	            treeMap.put("Cherry", treeMap.get("Cherry") + 10);
	            System.out.println("\nUpdated value for 'Cherry': " + treeMap.get("Cherry"));
	        }
	        
	        // Perform an operation based on value presence
	        if (treeMap.containsValue(20)) {
	            // Remove the entry with the value 20
	            treeMap.values().remove(20);
	            System.out.println("\nRemoved the entry with value 20.");
	        }
	        
	        // Display the updated TreeMap
	        System.out.println("\nUpdated TreeMap:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	        
	        treeMap.computeIfPresent("Cherry", (key, value) -> + + 100);
	        System.out.println("TreeMap after computeIfPresent for 'Cheery': " + treeMap);
	        
	        String keyToAccess = "Cherry";
	        Integer value = treeMap.get(keyToAccess);
	        System.out.println("Value associated with '" + keyToAccess + "': " + value);
	        
	     // Remove a key-value pair
	        String keyToRemove = "Date";
	        treeMap.remove(keyToRemove);
	        System.out.println("LinkedHashMap after removing '" + keyToRemove + "': " + treeMap);
	    }


}
