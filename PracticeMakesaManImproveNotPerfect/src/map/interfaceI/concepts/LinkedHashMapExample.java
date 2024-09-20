package map.interfaceI.concepts;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.LinkedHashMap;
public class LinkedHashMapExample {
	  public static void main(String[] args) {
    // Create a lhm instance
		  LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    
    // Adding entries to the lhm
    lhm.put("Apple", 50);
    lhm.put("Banana", 30);
    lhm.put("Cherry", 75);
    lhm.put("Blubeery", 75);
    lhm.put("Date", 20);
    lhm.put("Elderberry", 100);
    
    // Displaying the lhm
    System.out.println("lhm entries:");
    for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    // Accessing specific elements
    System.out.println("\nSpecific elements:");
    System.out.println("Apple: " + lhm.get("Apple"));  // Get value associated with key "Apple"
    System.out.println("Banana: " + lhm.get("Banana")); // Get value associated with key "Banana"
    
    // Removing an entry
    lhm.remove("Date");
    System.out.println("\nlhm after removing 'Date':");
    for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    // Getting the first and last keys
    System.out.println("\nFirst and last keys:");
//    System.out.println("First key: " + lhm.firstKey());not possible
//    System.out.println("Last key: " + lhm.lastKey());not possible
    
    // Getting a submap
//    System.out.println("\nSubmap from 'Banana' to 'Elderberry':");
//    SortedMap<String, Integer> subMap = lhm.subMap("Banana", "Date");
//    for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
//        System.out.println(entry.getKey() + ": " + entry.getValue());
//    }
////    
//    // Getting the highest and lowest values less than or equal to a given key
//    System.out.println("\nClosest lower or equal and higher or equal keys:");
//    System.out.println("Floor key of 'Cherry': " + lhm.floorKey("Cherry"));
//    System.out.println("Ceiling key of 'Cherry': " + lhm.ceilingKey("Cherry"));not possible
    
    Iterator<Map.Entry<String, Integer>> iterator = lhm.entrySet().iterator();
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
    // Print the lhm after removal
    System.out.println("\nlhm after removal of entries with values less than 50:");
    for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    
 // Check if specific keys and values are present
    String keyToCheck = "Banana";
    Integer valueToCheck = 75;
    
    // Check if the key is present
    if (lhm.containsKey(keyToCheck)) {
        System.out.println("The key '" + keyToCheck + "' is present in the lhm.");
    } else {
        System.out.println("The key '" + keyToCheck + "' is not present in the lhm.");
    }
    
    // Check if the value is present
    if (lhm.containsValue(valueToCheck)) {
        System.out.println("The value '" + valueToCheck + "' is present in the lhm.");
    } else {
        System.out.println("The value '" + valueToCheck + "' is not present in the lhm.");
    }
    
    // Perform an operation based on key presence
    if (lhm.containsKey("Cherry")) {
        // Update the value associated with the key "Cherry"
        lhm.put("Cherry", lhm.get("Cherry") + 10);
        System.out.println("\nUpdated value for 'Cherry': " + lhm.get("Cherry"));
    }
    
    // Perform an operation based on value presence
    if (lhm.containsValue(20)) {
        // Remove the entry with the value 20
        lhm.values().remove(20);
        System.out.println("\nRemoved the entry with value 20.");
    }
    
    // Display the updated lhm
    System.out.println("\nUpdated lhm:");
    for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    lhm.computeIfPresent("Cherry", (key, value) -> value + 100);
    System.out.println("lhm after computeIfPresent for 'Cheery': " + lhm);

    // Access a value
    String keyToAccess = "Cherry";
    Integer value = lhm.get(keyToAccess);
    System.out.println("Value associated with '" + keyToAccess + "': " + value);

    // Update a value
    String keyToUpdate = "Banana";
    lhm.put(keyToUpdate, 35); // Update Banana's value
    System.out.println("LinkedHashMap after updating '" + keyToUpdate + "': " + lhm);

    // Remove a key-value pair
    String keyToRemove = "Date";
    lhm.remove(keyToRemove);
    System.out.println("LinkedHashMap after removing '" + keyToRemove + "': " + lhm);
    

    // Value to find the corresponding key
    Integer valueToFind = 189;

    // Find key by value
    String keyFound = getKeyByValue(lhm, valueToFind);

    // Print the result
    if (keyFound != null) {
        System.out.println("Key associated with value '" + valueToFind + "': " + keyFound);
    } else {
        System.out.println("Value '" + valueToFind + "' not found in the LinkedHashMap.");
    }
}
	  

    
private static String getKeyByValue(LinkedHashMap<String, Integer> map, Integer value) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue().equals(value)) {
            return entry.getKey();
        }
    }
    return null; // Return null if value is not found
}

}
