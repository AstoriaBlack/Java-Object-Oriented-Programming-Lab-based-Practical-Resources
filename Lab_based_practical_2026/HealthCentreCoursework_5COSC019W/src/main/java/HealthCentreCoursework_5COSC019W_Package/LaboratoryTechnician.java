package HealthCentreCoursework_5COSC019W_Package;

public class LaboratoryTechnician extends StaffMember{
    private String labSection;
    private String certificationLevel;
    private int numberOfTestsHandledPerDay;

    public LaboratoryTechnician(String name, String surname) {
        super(name,surname);
    }

    public String getLabSection() {
        return labSection;
    }

    public void setLabSection(String labSection) {
        this.labSection = labSection;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public int getNumberOfTestsHandledPerDay() {
        return numberOfTestsHandledPerDay;
    }

    public void setNumberOfTestsHandledPerDay(int numberOfTestsHandledPerDay) {
        this.numberOfTestsHandledPerDay = numberOfTestsHandledPerDay;
        if(numberOfTestsHandledPerDay < 0) {
            this.numberOfTestsHandledPerDay = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " , lab Section: " + labSection + ", certification Level: " + certificationLevel
                + " ,number Of Tests Handled Per Day: " + numberOfTestsHandledPerDay;
    }
}
