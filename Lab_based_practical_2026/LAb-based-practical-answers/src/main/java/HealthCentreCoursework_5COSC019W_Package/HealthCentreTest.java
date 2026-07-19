package HealthCentreCoursework_5COSC019W_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HealthCentreTest {

//    @BeforeEach
//    public void settingUpObject() {
//        Receptionist receptionist = new Receptionist("Astoria","Black");
//    }

    @Test
    public void testReceptionistConstructor() {
        Receptionist receptionist = new Receptionist("Astoria","Black");
        assertEquals("Astoria",receptionist.getName());
        assertEquals("Black",receptionist.getSurname());
    }

    @Test
    public void testGetterSetter() {
        Receptionist receptionist = new Receptionist("Astoria","Black");
        receptionist.setDeskNumber(85);
        assertEquals(85,receptionist.getDeskNumber());
    }

    @Test
    public void testActiveByDefault() {
        Receptionist receptionist = new Receptionist("Astoria","Black");
        assertTrue(receptionist.isActive());
    }

    @Test
    public void testSetActiveFalse() {
        Receptionist receptionist = new Receptionist("Astoria","Black");
        receptionist.setActive(false);
        assertFalse(receptionist.isActive());
    }

}
