package HealthCentreCoursework_5COSC019W_Package;

public class Nurse extends StaffMember{
    private String ward;
    private String shiftType;
    private int yearOfExperience;

    public Nurse(String name, String surname) {
        super(name,surname);
    }

    public String getWard() {
        return ward;
    }

    public String getShiftType() {
        return shiftType;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() +  " Nurse - Ward: " + ward + ",  Shift type: " + shiftType+
                " , years of experience: " + yearOfExperience;
    }
}
