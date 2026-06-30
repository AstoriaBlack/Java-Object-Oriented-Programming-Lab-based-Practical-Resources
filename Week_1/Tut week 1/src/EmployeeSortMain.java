import java.util.Arrays;
public class EmployeeSortMain {
    public static void main(String[] args) {
        //create array of employees

        EmployeeCustomSort[] employees = {
                new EmployeeCustomSort(10,"Alice", 21, 50000),
                new EmployeeCustomSort(20,"Bob", 35,60000),
                new EmployeeCustomSort(30,"Charlie",43, 55000),
                new EmployeeCustomSort(40,"David", 77,70000),
        };

        //sort using Array.sort()
        Arrays.sort(employees); //sorts the array in ascending order based on the compareTo method in EmployeeCustomSort class

        //print sorted employees
        System.out.println("Employees sorted by salary: ");
        for (EmployeeCustomSort emp : employees) {
            System.out.println(emp);
        }

    }
}
