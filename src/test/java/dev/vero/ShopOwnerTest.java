package dev.vero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopOwnerTest {

    @Test
    public void testShopOwnerCreation() {
        ShopOwner owner = new ShopOwner("John Doe", "johndoe@example.com");
        assertEquals("John Doe", owner.getName());
        assertEquals("johndoe@example.com", owner.getContactInfo());
    }

    @Test
    public void testToString() {
        ShopOwner owner = new ShopOwner("John Doe", "johndoe@example.com");
        String expected = "ShopOwner{name='John Doe', contactInfo='johndoe@example.com'}";
        assertEquals(expected, owner.toString());
    }
}
