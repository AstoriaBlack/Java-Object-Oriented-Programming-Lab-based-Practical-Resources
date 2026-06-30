public class ArrayPractice {

    public static void main(String[] args) {

        int[] kithznums = new int [5];
        kithznums[0] = 1;
        kithznums[1] = 2;
        kithznums[2] = 3;
        kithznums[3] = 3;
        kithznums[4] = 5;

        for (int index = 0; index < kithznums.length; index++){
            System.out.println("kithznums[" + index + "] = " + kithznums[index]);
        }

        int[] scores = {100, 90, 80, 70, 60}; //another way to initialize an array

        //length of an array
        System.out.println("Length of kithznums: " + kithznums.length); // Should print the length of the array

        //clearing an array
        for (int i = 0; i < kithznums.length; i++) {
            kithznums[i] = 0; // Setting each element to 0
        }

        //isEmpty check
        boolean isEmpty = true;
        for (int num : kithznums) {
            if (num != 0) {
                isEmpty = false; // If any element is not 0, the array is not empty
                break;
            }
        }

        //no built-in isEmpty method for arrays, so we check manually
        //always have to iterate for checking stuff in an array
    }
}
