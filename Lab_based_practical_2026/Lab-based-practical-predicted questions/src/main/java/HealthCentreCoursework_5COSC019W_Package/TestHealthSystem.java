package HealthCentreCoursework_5COSC019W_Package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestHealthSystem {
    @Test
    public void testReceptionist() {
        Receptionist receptionist = new Receptionist("Kithmini","Jayaweera");
        assertEquals("Kithmini",receptionist.getName());
        receptionist.setDeskNumber(5);
        assertEquals(5,receptionist.getDeskNumber());

    }
    @Test
    public void testActivebyDefault() {
        Receptionist receptionist = new Receptionist("Kithmini","Jayaweera");
        assertTrue(receptionist.isActive());
        receptionist.setActive(false);
        assertFalse(receptionist.isActive());
    }

}
