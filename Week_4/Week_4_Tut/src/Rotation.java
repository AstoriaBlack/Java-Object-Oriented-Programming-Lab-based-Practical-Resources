public class Rotation {

    public static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }

    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        return isSubstring(s1 + s1, s2);
    }

    public static void main(String[] args) {

        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("hello", "llohe"));
        System.out.println(isRotation("hello", "olelh"));

    }

}