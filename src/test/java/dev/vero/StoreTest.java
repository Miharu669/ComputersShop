package dev.vero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {
    private Store store;

    @BeforeEach
    public void setUp() {
        ShopOwner owner = new ShopOwner("John Doe", "johndoe@example.com");
        store = new Store("Max Computers", "123456789", owner);
    }

    @Test
    public void testAddComputer() {
        Computer comp = new Computer("HP", "16GB", "Intel i7", "Windows 10", 1200.00);
        store.addComputer(comp);
        assertNotNull(store.findComputer("HP"));
    }

    @Test
    public void testRemoveComputer() {
        Computer comp = new Computer("Dell", "8GB", "Intel i5", "Windows 11", 800.00);
        store.addComputer(comp);
        store.removeComputer("Dell");
        assertNull(store.findComputer("Dell"));
    }

    @Test
    public void testFindComputer() {
        Computer comp = new Computer("Asus", "32GB", "AMD Ryzen 7", "Linux", 1500.00);
        store.addComputer(comp);
        Computer found = store.findComputer("Asus");
        assertNotNull(found);
        assertEquals("Asus", found.getBrand());
    }

    @Test
    public void testListComputers() {
        Computer comp1 = new Computer("Acer", "16GB", "Intel i9", "Windows 10", 2000.00);
        Computer comp2 = new Computer("Lenovo", "8GB", "Intel i3", "Ubuntu", 600.00);
        store.addComputer(comp1);
        store.addComputer(comp2);

        assertDoesNotThrow(() -> store.listComputers());
    }

    @Test
    public void testGetOwner() {
        ShopOwner owner = store.getOwner();
        assertNotNull(owner);
        assertEquals("John Doe", owner.getName());
        assertEquals("johndoe@example.com", owner.getContactInfo());
    }

    @Test
    public void testStoreToString() {
        String expected = "Store{name='Max Computers', taxId='123456789', owner=ShopOwner{name='John Doe', contactInfo='johndoe@example.com'}}";
        assertEquals(expected, store.toString());
    }
}

