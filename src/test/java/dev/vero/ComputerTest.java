package dev.vero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    public void testComputerCreation() {
        Computer comp = new Computer("HP", "16GB", "Intel i7", "Windows 10", 1200.00);
        assertEquals("HP", comp.getBrand());
        assertEquals("16GB", comp.getMemory());
        assertEquals("Intel i7", comp.getProcessor());
        assertEquals("Windows 10", comp.getOperatingSystem());
        assertEquals(1200.00, comp.getPrice());
    }

    @Test
    public void testSetters() {
        Computer comp = new Computer("HP", "16GB", "Intel i7", "Windows 10", 1200.00);

        comp.setBrand("HP Elite");
        comp.setMemory("32GB");
        comp.setProcessor("Intel i9");
        comp.setOperatingSystem("Windows 11");
        comp.setPrice(1500.00);

        assertEquals("HP Elite", comp.getBrand());
        assertEquals("32GB", comp.getMemory());
        assertEquals("Intel i9", comp.getProcessor());
        assertEquals("Windows 11", comp.getOperatingSystem());
        assertEquals(1500.00, comp.getPrice());
    }

    @Test
    public void testToString() {
        Computer comp = new Computer("HP", "16GB", "Intel i7", "Windows 10", 1200.00);
        String expected = "Computer{brand='HP', memory='16GB', processor='Intel i7', operatingSystem='Windows 10', price=1200.0}";
        assertEquals(expected, comp.toString());
    }
}
