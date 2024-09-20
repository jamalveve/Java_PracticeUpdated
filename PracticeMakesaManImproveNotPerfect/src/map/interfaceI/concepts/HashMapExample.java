package map.interfaceI.concepts;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {

		 Map map1=new HashMap();  
		    //Adding elements to map  
		 map1.put(1,"Amit");  
		 map1.put(null,"Rahul");  
		 map1.put(2,"Jai");  
		 map1.put(6,"Amit");  
		    //Traversing Map  in old way
		    Set set=map1.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
//		    	System.out.println(itr.next());
		    	//Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    } 
		    
		    
		   //new way
		    Map<Integer,String> map2=new HashMap<Integer,String>();  
		    map2.put(100,"Amit");  
		    map2.put(101,"Vijay");  
		    map2.put(102,"Rahul");  
		    //Elements can traverse in any order  
		    for(Map.Entry m:map2.entrySet()){  
		    	   System.out.println(m.getKey()+" "+m.getValue());  
		    	   }  
		    
		    HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		    hm.put(110,"Ravi");  
		    hm.put(120,"Prateek");  
		    hm.put(130, "Davesh");    
		    hm.put(140, "Kamal");  
		    hm.put(150, "Pawan");  
		    //iterating based on the key
		    Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		    while(it.hasNext())  
		    {  
		    int key=(int)it.next();  
		    System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
	}
		    
		    Map<String,String> map = new HashMap<String,String>();   
		    map.put("Gujarat", "Gandhi Nagar");               
		    map.put("Uttar Pradesh", "Lucknow");   
		    map.put("Sikkim", "Ganagtok");   
		    
		  
		    for (String State : map.keySet())  {//iterating over key separetly
		    	//using keyset() method for iteration over keySet
//		    	String pick=String.CASE_INSENSITIVE_ORDER;
		    	if(State.contains("S"))//if we try o remove in for loop concurrent mpdifucatin will comeso spo bettre use iteratir and removed	
		   //or else change it to another map and remove that way
//		    		keysToRemove.put(State);//you want t add both key and value so cant do here as thod for loop only iterates over key check next forloop
		    		System.out.println("State: " + State); 
		    }	
		    //removal process stafrts//doubt
		    Map<String,String> keysToRemove = new HashMap<>();
		    for(Map.Entry<String, String> entry:map.entrySet()) {
		    	if(map.keySet().contains("Sik")) {
		    		keysToRemove.put(entry.getKey(),entry.getValue());
		    	}
		    }
		    for (Map.Entry<String, String> entry : keysToRemove.entrySet()) {
	            map.remove(entry);
	        }
		    // //iteration over keys and value  printing bothe keyand value
		    for (Map.Entry<String, String> entry : map.entrySet()) {
	            System.out.println("after removing State: " + entry.getKey() + ", Capital: " + entry.getValue());
	        }
		    //ends
		    for (String Capital : map.values())         //iteration over values separately 
		    System.out.println("Capiatl: " + Capital);   
		    
		    for (String name: map.keySet())         //iteration over keys  but printing bothe keyand value
		    {  
		    	 String value = map.get(name);
		    System.out.println("Key: " + name + ", Value: " + value);  
		    
		    }   
//		    for (String value : map.values())         //iteration over keys  but printing bothe keyand value
//		    {  
//		    	 String key = map.get(value);
//		    	 System.out.println(key);
////		    System.out.println("Key: " + key + ", Value: " + value);  
//		    	
//		    }   not possoble
		    
		    String keyToCheck = "Banana";
	        String valueToCheck = "Gujarat";
	        
	        // Check if the key is present
	        if (map.containsKey(keyToCheck)) {
	            System.out.println("The key '" + keyToCheck + "' is present in the TreeMap.");
	        } else {
	            System.out.println("The key '" + keyToCheck + "' is not present in the TreeMap.");
	        }
	        
	        if (map.containsKey("Sikkim")) {
	            // Update the value associated with the key "Cherry"
	            map.put("Sikkim", map.get("Sikkim") + "zzz");
	            System.out.println("\nUpdated value for 'Sikkim': " + map.get("Cherry"));
	        }

	        System.out.println("updated HashMAp");
	        for(Map.Entry<String, String> entries:map.entrySet()) {
	        	System.out.println("key: "+entries.getKey()+" ,value: "+entries.getValue());
	        }
		    if(map.equals(hm)) {
		     System.out.println("equals");
		    }else {
		    	System.out.println("not equals");
		    }
		    
		    String keyToUpdate = "Uttar Pradesh	";
		    // Standard if condition to achieve the same result as computeIfPresent
	        if (map.containsKey(keyToUpdate)) {
	            // Get the current value associated with the key
	            String currentValue = map.get(keyToUpdate);
	            // Modify the value
	            String newValue = currentValue + " (Updated)";
	            // Put the updated value back into the map
	            map.put(keyToUpdate, newValue);//doubt
	        }
	        map.computeIfPresent("Uttar Pradesh", (key, value) -> value + "updates");
	        System.out.println("TreeMap after computeIfPresent for 'uttarpraddesh': " + map);
	        
	        String keyToAccess = "Sikkim";
	        String value = map.get(keyToAccess);
	        System.out.println("Value associated with '" + keyToAccess + "': " + value);
	        
	        String ValueAccess = "Lucknow";
	        String key = map.get(ValueAccess);
	        System.out.println("Value associated with '" + ValueAccess + "': " + key);//not possible
	        
	     // Remove a key-value pair
	        String keyToRemove = "Gujarat";
	        map.remove(keyToRemove);
	        System.out.println("LinkedHashMap after removing '" + keyToRemove + "': " + map);
	}
}
