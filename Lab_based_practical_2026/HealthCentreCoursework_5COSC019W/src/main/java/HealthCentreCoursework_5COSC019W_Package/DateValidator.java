package HealthCentreCoursework_5COSC019W_Package;

import java.time.LocalDate;

public class DateValidator {
    public static LocalDate validateDob(LocalDate dob) throws InvalidDateOfBirthException{
        if (dob.isAfter(LocalDate.now())) {
            throw new InvalidDateOfBirthException("Date of birth cannot be in the future.");
        }
        if (dob.plusYears(18).isAfter(LocalDate.now())) {
            throw new InvalidDateOfBirthException("Staff member must be at least 18 years old.");
        }
        return dob;
    }
}
