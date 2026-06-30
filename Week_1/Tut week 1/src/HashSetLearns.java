import java.util.HashSet;


public class HashSetLearns {
    //A HashSet is a collection of elements where every element is unique.
    //It is part of the java.util package and implements the Set interface.
    public static void main(String[] args) {
        //Create a HashSet object called cars that will store strings:
        HashSet<String> cars = new HashSet<>();

        //To add items to a HashSet, use the add() method:
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Audi");

        //Adding a duplicate item will not change the HashSet:
        cars.add("BMW"); // This will not be added again, as HashSet does not allow duplicates

        //To check if an item exists in the HashSet, use the contains() method:
        System.out.println("if the car volvo exists:" + cars.contains("Volvo")); // Returns true if "Volvo" is in the set)

        //To remove an item, use the remove() method:
        cars.remove("Audi");
        System.out.println("After removing Audi: " + cars);

        //To check the size of the HashSet, use the size() method:
        System.out.println("Size of the HashSet: " + cars.size()); // Returns the number of elements in the set

        //To iterate through the elements in a HashSet, you can use a for-each loop:
        System.out.println("Cars in the HashSet:");
        for (String c : cars) {
            System.out.println(c);
        }
        //To clear all items from the HashSet, use the clear() method:
        cars.clear();
        System.out.println("After clearing, size of the HashSet: " + cars.size()); // Should print 0
        System.out.println(cars); // Should print an empty set
        //To check if the HashSet is empty, use the isEmpty() method:
        if (cars.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }

        //Elements in an HashSet are actually objects.
        // In the examples above, we created elements (objects) of type "String".
        // Remember that a String in Java is an object (not a primitive type).
        // To use other types, such as int, you must specify an equivalent wrapper class: Integer.

        //Example with Integer:
        HashSet<Integer> numbers = new HashSet<>();
        //Adding numbers to the HashSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //HashSet does not maintain the order of elements, so the output may not be in the order you added them.
        //HashSet is not synchronized, meaning it is not thread-safe.
        //It allows null values, but only one null value can be added.
        //HashSet is generally faster than other Set implementations like TreeSet or LinkedHashSet for basic operations like add, remove, and contains.
        //HashSet is a good choice when you need a collection of unique elements and do not care about the order of elements.



    }
}
