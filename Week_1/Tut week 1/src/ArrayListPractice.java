import java.util.ArrayList;
public class ArrayListPractice {

    public static void main(String[] args) {

        //Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type).
        // To use other types, such as int, you must specify an equivalent wrapper class: Integer.
        // For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
// --------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList <Integer> kithzNums = new ArrayList<Integer>(4); // Create an ArrayList object called kithzNums that will store Integer objects

        //duplicate values are allowed in an ArrayList
// --------------------------------------------------------------------------------------------------------------------------------------------
        //adding elements to the ArrayList
        kithzNums.add(1);
        kithzNums.add(2);
        kithzNums.add(2);
//--------------------------------------------------------------------------------------------------------------------------------------------
        kithzNums.add(2,78); // Adding 78 at index 2, shifting the existing elements to the right

        for (int i : kithzNums) {
            System.out.println("kithzNums = " + i);
        }
// --------------------------------------------------------------------------------------------------------------------------------------------
        //accessing elements in an ArrayList
        System.out.println("First element in kithzNums: " + kithzNums.get(0)); // Accessing the first element
        //also 0 index can accessed using getFirst() method
// --------------------------------------------------------------------------------------------------------------------------------------------
        //modifying elements in an ArrayList
        kithzNums.set(0, 3);

        System.out.println("After setting first element to 3: " + kithzNums); // Accessing the first element after modification
// --------------------------------------------------------------------------------------------------------------------------------------------

        int index1 = kithzNums.indexOf(2); // Finding the index of the first occurrence of 2
        // If the element is not found, indexOf() returns -1
        // If you want to find the last occurrence of an element, use lastIndexOf() method

//--------------------------------------------------------------------------------------------------------------------------------------------

        int index2 = kithzNums.lastIndexOf(2);
        int index3 = kithzNums.lastIndexOf(4); // Finding the index of the last occurrence of 4, which does not exist in the list

        System.out.println("Index of first occurrence of 2: " + index1); // Should print the index of the first occurrence of 2
        System.out.println("Index of last occurrence of 2: " + index2); // Should print the index of the last occurrence of 2
        System.out.println("Index of last occurrence of 4: " + index3); // Should print the index of the last occurrence of 3 returns -1 since 4 is not in the list

//    --------------------------------------------------------------------------------------------------------------------------------------------
       //removing elements from an ArrayList
        kithzNums.remove(index1);
        System.out.println("After removing the first occurrence of 2: " + kithzNums); // Should print the ArrayList after removing the first occurrence of 2

        kithzNums.add(2, 58);

       //removing any value found from the ArrayList
        kithzNums.remove(Integer.valueOf(58)); // Removing the first occurrence of 58 from the ArrayList
        System.out.println("After removing 58: " + kithzNums); // Should print the ArrayList after removing 58

        kithzNums.remove(kithzNums.get(1)); // Removing the element at index 2
        System.out.println("After removing element at index 1: " + kithzNums); // Should print the ArrayList after removing the element at index 2

        //removing any elements found from a given list
        ArrayList<Integer> toRemove = new ArrayList<>();
        toRemove.add(2);
        toRemove.add(3);
        toRemove.add(1);

        toRemove.removeAll(kithzNums);
        System.out.println("After removing elements from toRemove: " + toRemove); // Should print the ArrayList after removing elements from toRemove

        //Remove all element not found in the given list from another arraylist
        ArrayList<Integer> toAdd = new ArrayList<>();
        toAdd.add(2);
        toAdd.add(3);
        toAdd.add(1);

        toAdd.retainAll(kithzNums);
        System.out.println("After retaining elements found in kithzNums: " + toAdd); // Should print the ArrayList after retaining elements found in kithzNums

// --------------------------------------------------------------------------------------------------------------------------------------------
       //size of an ArrayList
        System.out.println("Size of kithzNums: " + kithzNums.size()); // Should print the size of the ArrayList

        //return a string representation of the ArrayList
        System.out.println("String representation of kithzNums: " + kithzNums.toString()); // Should print the string representation of the ArrayList
        //toString() method is called automatically when you print an ArrayList
// --------------------------------------------------------------------------------------------------------------------------------------------
       // adds all elements from the given list to this list
        ArrayList<Integer> anotherList = new ArrayList<>();
        anotherList.add(10);
        anotherList.add(20);
        anotherList.add(30);
        anotherList.add(1, 78); // Adding 58 at index 1

        kithzNums.addAll(anotherList); // Adding all elements from anotherList to kithzNums
        System.out.println("After adding anotherList: " + kithzNums); // Should print the ArrayList after adding anotherList

        //normally at the end of the list it added but we can customise

        kithzNums.addAll(2, anotherList); // Adding all elements from anotherList at index 2
        System.out.println("After adding anotherList at index 2: " + kithzNums); // Should print the ArrayList after adding anotherList at index 2
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
        //returns true if given value is found somewhere in this list

        boolean containsValue = kithzNums.contains(58); // Checking if the ArrayList contains the value 58
        System.out.println("Does kithzNums contain 58? " + containsValue); // Should print true if 58 is in the list, false otherwise

        //returns true if all elements in the given collection are found in this list
        boolean containsAll = kithzNums.containsAll(anotherList);
        System.out.println("Does kithzNums contain all elements of anotherList? " + containsAll); // Should print true if all elements of anotherList are in kithzNums
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // returns true if given other list contains the same elements

        ArrayList<Integer> anotherList2 = new ArrayList<>();
        anotherList2.add(10);
        anotherList2.add(20);
        anotherList2.add(30);

        anotherList2.add(1, 78); // Adding 78 at index 1

        boolean isEqual = kithzNums.equals(anotherList2);
        System.out.println("Is kithzNums equal to anotherList2? " + isEqual); // Should print true if both lists have the same elements in the same order, false otherwise

        boolean isEqualAgain = anotherList.equals(anotherList2);
        System.out.println("Is anotherList equal to anotherList2? " + isEqualAgain); // Should print true if both lists have the same elements in the same order, false otherwise

//--------------------------------------------------------------------------------------------------------------------------------------------
       //sublist - returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        //sublist(from,to)

        ArrayList<Integer> subListOne = new ArrayList<> (anotherList2.subList(0,3));// Creating a sublist from anotherList2 from index 1 to index 3 (exclusive)
        System.out.println("Sublist from anotherList2: " + subListOne); // Should print the sublist from index 1 to index 3 (exclusive)
        //last index is exclusive so it will not be included in the sublist
        //like python, 3 means that index won't be there
        System.out.println("anotherList2: " + anotherList2); // Should print the original list to show it is unchanged

//----------------------------------------------------------------------------------------------------------------------------------------------------
        //returns the element as an Array
        Integer[] arrayFromList = kithzNums.toArray(new Integer[kithzNums.size()]);


//------------------------------------------------------------------------------------------------------------------------------------------------

       //clears     the ArrayList
        kithzNums.clear(); // Clearing the ArrayList
        System.out.println("After clearing kithzNums: " + kithzNums); // Should print an empty ArrayList

        //checks if the ArrayList is empty
        boolean isEmpty = kithzNums.isEmpty(); // Checking if the ArrayList is empty
        System.out.println("Is kithzNums empty? " + isEmpty); // Should print true if the ArrayList is empty, false otherwise

    }


}
