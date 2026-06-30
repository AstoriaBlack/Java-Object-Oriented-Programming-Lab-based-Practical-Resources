public class EmployeeCustomSort implements Comparable<EmployeeCustomSort> {

    private int id;
    private String name;
    private int age;
    private int salary;

    //constructor
    public EmployeeCustomSort(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Getters
    public int getId() {return id;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getSalary() {return salary;}

    //Define how to compare Employees (by salary)
    @Override
    public int compareTo(EmployeeCustomSort other) {
        return this.salary - other.salary; // Ascending order by salary
    }

    @Override
    public String toString() {
        return "EmployeeCustomSort [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
