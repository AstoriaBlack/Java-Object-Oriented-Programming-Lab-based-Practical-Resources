import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; //collections is a utility class that provides static methods for working with collections
import java.util.List;

public class SortingLec5 {

    public static void main(String[] args) {

        //sort primitives array like int array
        int[] intArr = {5,29,10,11};
        Arrays.sort(intArr); //sorts the array in ascending order
        System.out.println(Arrays.toString(intArr));

        //sorting string array
        String[] strArr = {"A", "C", "B", "Z", "F"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //sorting list of objects of Wrapper class

        List<String> strList = new ArrayList<String>(); //List is an interface, ArrayList is a class that implements List interface

        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("F");

        Collections.sort(strList); //sorts the list in ascending order
        //why Collections.sort() is used? because List is an interface and it doesn't have a sort method, but Collections is a utility class that provides static methods for working with collections
        for (String str : strList) System.out.print(" "+str);
    }

}
