package tutorial05_shapecollection;

public class UniqueCharacters {

    // Method to check if all characters are unique
    public static boolean hasUniqueCharacters(String str) {

        // Compare every character with the remaining characters
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    return false;   // Duplicate character found
                }

            }

        }

        return true;    // No duplicates found
    }

    public static void main(String[] args) {

        String word1 = "abcdef";
        String word2 = "hello";
        String word3 = "Java";
        String word4 = "Python";

        System.out.println(word1 + " -> " + hasUniqueCharacters(word1));
        System.out.println(word2 + " -> " + hasUniqueCharacters(word2));
        System.out.println(word3 + " -> " + hasUniqueCharacters(word3));
        System.out.println(word4 + " -> " + hasUniqueCharacters(word4));

    }
}