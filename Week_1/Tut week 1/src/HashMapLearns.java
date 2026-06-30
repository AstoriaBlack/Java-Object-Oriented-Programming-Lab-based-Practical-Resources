import java.util.HashMap;
public class HashMapLearns {
   /* A HashMap stores items in key/value pairs, where each key maps to a specific value.

    It is part of the java.util package and implements the Map interface.

    Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.

    A HashMap can store many different combinations, such as: anyyy objects...even Dog object

    String keys and Integer values
    String keys and String values   */
    public static void main(String[] args) {
        //Create a HashMap object called capitalCities that will store String keys and String values:
        HashMap <String, String> capitalCities = new HashMap<>();

        //To add items to a HashMap, use the put() method:
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicates won't be added, it will just replace the existing value for the key "Norway"
        //latest value must be added because key is always unique
        capitalCities.put("USA", "Washington DC");

        //HashMap doesn't maintain the order of elements, so the order of items may not be the same as the order in which they were added.
        System.out.println(capitalCities);

        //To access an item in a HashMap, use the get() method:
        System.out.println(capitalCities.get("England"));


        //To remove an item, use the remove() method:
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //To check if a key exists in the HashMap, use the containsKey() method:
        if (capitalCities.containsKey("India")) {
            System.out.println("Capital of India is: " + capitalCities.get("India"));
        } else {
            System.out.println("Capital of India not found.");
        }

        //To check if a value exists in the HashMap, use the containsValue() method:
        if (capitalCities.containsValue("Wien")) {
            System.out.println("Austria's capital is Wien.");
        } else {
            System.out.println("Capital not found.");
        }

        //To iterate through the keys in a HashMap, you can use a for-each loop:
        System.out.println("Countries in the HashMap:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country);
        }
        //To iterate through the values in a HashMap, you can use a for-each loop:
        System.out.println("Capitals in the HashMap:");
        for (String capital : capitalCities.values()) {
            System.out.println(capital);
        }
        //To iterate through both keys and values in a HashMap, you can use a for-each loop with Map.Entry:
        System.out.println("Countries and their capitals:");
        for (HashMap.Entry<String, String> entry : capitalCities.entrySet()) { //entrySet() returns a set of key-value pairs
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        //another way
        // Print keys and values
        System.out.println("Keys and values in the HashMap:");
         //Using keySet() to get all keys and then using get() to retrieve values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        //Keys and values in a HashMap are actually objects.
        // In the examples above, we used objects of type "String".
        // Remember that a String in Java is an object (not a primitive type).
        // To use other types, such as int, you must specify an equivalent wrapper class: Integer.
        // For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> countryCodes = new HashMap<>();
        // Add some country codes
        countryCodes.put(1, "USA");
        countryCodes.put(44, "UK");
        countryCodes.put(91, "India");

        //display the country codes
        System.out.println("Country codes:");
        for (Integer key : countryCodes.keySet()) {
            System.out.println(key+": " + countryCodes.get(key));
        }

        //To get the size of the HashMap, use the size() method:
        System.out.println("Number of countries in the HashMap: " + capitalCities.size());
        //To clear all items from the HashMap, use the clear() method:
        capitalCities.clear();
        System.out.println("After clearing, the HashMap size is: " + capitalCities.size());
        System.out.println("HashMap after clearing: " + capitalCities);

        //To check if the HashMap is empty, use the isEmpty() method:
        if (capitalCities.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

    //More trivia about HashMap:
    /* 1. HashMap is not synchronized, meaning it is not thread-safe.
       2. It allows null values and one null key.
       3. The order of elements in a HashMap is not guaranteed to be the same as the order in which they were added.
       4. HashMap uses a hash table to store key-value pairs, which allows for fast retrieval of values based on keys.
       5. The performance of a HashMap can degrade if many collisions occur (when different keys hash to the same index).
       6. The initial capacity and load factor can be specified when creating a HashMap to optimize performance.
       7. It modeled a map data structure, which is a collection of key-value pairs.
    */

    }

}
