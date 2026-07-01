public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Astoria", 23, "Female");
        System.out.println(p1);

        Student s1 = new Student("Lily",29,"Female",25);
        System.out.println(s1);

        Teacher t1 = new Teacher("Lewis Hamilton", 38, "Male","Physics",50000);
        System.out.println(t1);

        Person p2 = new Teacher("Lewis Hamilton", 38, "Male","Physics",50000);

        //Teacher t2 = new Person("Lewis Hamilton", 38, "Male");

        Person p3 = new Student ("Elisabeth Smith", 16, "Female", 45);

        Student s2 = new Student("Elle Black",29,"Female",55);
        Student s3 = new Student("Astoria Black",22,"Female",75);


        t1.addStudents(s1,0);
        t1.addStudents(s2,1);
        t1.addStudents(s1,2);

        // Print the teacher
        System.out.println(t1);

        // Print all tutees
        System.out.println("\nPersonal Tutees:");

        for (int i = 0; i < 3; i++) {

            Student student = t1.getStudent(i);

            if (student != null) {
                System.out.println(student);
            }

        }
    }

}
