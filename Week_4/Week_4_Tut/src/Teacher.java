public class Teacher extends Person {
    private double salary;
    private String subject;

    /**Each teacher has 3 students. This is a Has-A (aggregation/association) relationship.
     * The simplest implementation is:
     */

    private Student[] students = new Student[3];


    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name,age,gender);
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //now let's add students
    public void addStudents(Student student, int index) {
        students[index] = student;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    @Override
    public String toString() {
        return "Teacher [name: "+ super.getName()+", age: "+ super.getAge()+
        ", subject: "+ subject+", salary: "+ salary +"]";
    }
}
