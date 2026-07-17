package HealthCentreCoursework_5COSC019W_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class HealthCentreTest {
    @BeforeEach
    public void setUp() {
        WestminsterHealthCentreManager manager = new WestminsterHealthCentreManager(5);
        Doctor doctor = new Doctor("John", "Smith");

    }

//    @Test
//    public void testAddStaffToList() {
//        WestminsterHealthCentreManager manager = new WestminsterHealthCentreManager(5);
//
//        Doctor doctor = new Doctor("Astoria","Black");
//
//        manager.addStaffToList(doctor);
//
//        assertEquals(1,manager.staffMemberList.size());
//        assertTrue(manager.staffMemberList.contains(doctor));
//    }
    @Test
    public void testGetStringDate() {
        Doctor doctor = new Doctor("John", "Smith");
        doctor.setDob(LocalDate.of(1990,3,15));

        assertEquals("15/03/1990", doctor.getStringDate());

    }

    @Test
    public void testCompareTo() {
        Doctor doctor1 = new Doctor("John", "Smith");
        doctor1.setStaffID("A001");
        Doctor doctor2 = new Doctor("Harry", "Smith");
        doctor2.setStaffID("B001");

        assertTrue(doctor1.compareTo(doctor2) < 0);
    }

    @Test
    public void testFutureDobThrowsException(){
        assertThrows(InvalidDateOfBirthException.class, () -> {
            DateValidator.validateDob(LocalDate.now().plusDays(1));
        });
    }

    @Test
    public void testUnder18ThrowsException() {
        assertThrows(InvalidDateOfBirthException.class, () -> {
            DateValidator.validateDob(LocalDate.now().minusYears(10));
        });
    }

    @Test
    public void testValidDobDoesNotThrow() {
        assertDoesNotThrow(() -> {
            DateValidator.validateDob(LocalDate.of(1990, 1, 1));
        });
    }

//    @Test
//    public void testValidPhoneNumber() {
//        assertTrue(WestminsterHealthCentreManager.isValidPhoneNumber("0787719972"))
//    }

//    @Test
//    public void testCannotExceedCapacity() {
//        WestminsterHealthCentreManager manager = new WestminsterHealthCentreManager(1);
//        manager.addStaffToList(new Doctor("A","1"));
//        manager.addStaffToList(new Doctor("B","@"));
//
//        assertEquasl(1, manager.getStaffMemberList().size());
//
//    }
@Test
public void testDoctorToString() {
    Doctor doctor = new Doctor("John", "Smith");
    doctor.setStaffID("D001");
    doctor.setPhoneNo("07123456789");
    doctor.setLicenceNumber("LIC001");
    doctor.setSpecialisation("Cardiology");

    String result = doctor.toString();
    assertTrue(result.contains("Cardiology"));
    assertTrue(result.contains("D001"));
}


}
