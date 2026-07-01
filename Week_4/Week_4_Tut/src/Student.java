public class Student extends Person {
    private int idNumber;
    private double fee;
    private String grade;

    public Student(String name, int age, String gender, int idNum) {
        super(name, age, gender);
        idNumber = idNum;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getFee() {
        return fee;
    }

    public String getGrade() {
        return grade;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student [idNumber=" + idNumber +"name=" + super.getName() + ", age=" + super.getAge()
                + ", gender=" + super.getGender() +
                ", fee=" + fee + "grade=" + grade + "]";
    }
}


