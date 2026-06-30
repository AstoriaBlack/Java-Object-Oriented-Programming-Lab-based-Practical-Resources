import java.util.Arrays;

public class ArraysLearn {
    public static void main(String[] args) {
        int[] numbers = {10, 30, -25, 17};

        // Sort the array
        Arrays.sort(numbers);  // Now: [-25, 10, 17, 30]

        // Binary search (returns index 2)
        int index = Arrays.binarySearch(numbers, 17);
        System.out.println("Index of 17: " + index);  // Output: 2

        //also you can binarysearch like, Arrays.binarySearch(array, minIndex, maxIndex, value);
        int index2 = Arrays.binarySearch(numbers,0,3,17);
        System.out.println("Index of 17 in range 0 to 3: " + index2);  // Output: 2

        // Create a resized copy
        int[] largerArray = Arrays.copyOf(numbers, 6);  // [-25, 10, 17, 30, 0, 0] new length for the new copy

        // Fill with zeros
        Arrays.fill(largerArray, 0);  // [0, 0, 0, 0, 0, 0]

        //Fill with a specific value
        Arrays.fill(largerArray, 3);

        // Print the array
        System.out.println(Arrays.toString(largerArray));  // Output: [3, 3, 3, 3, 3, 3]
    }
}