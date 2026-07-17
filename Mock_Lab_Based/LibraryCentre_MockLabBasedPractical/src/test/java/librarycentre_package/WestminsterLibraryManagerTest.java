package librarycentre_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WestminsterLibraryManagerTest {

//    @Test
//    public void testAddItemsToList() {
//        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);
//        Book book = new Book("Harry Potter","123456");
//
//        manager.addItemToList(book);
//
//        assertEquals(1,manager.itemList.size());
//        assertTrue(manager.itemList.contains(book));
//    }
    @BeforeEach
    public void setUp() {
        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);
    }

    @Test
    public void testAddItemsToList() {
        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);
        Magazine magazine = new Magazine("Vogue","isbn-123456");
        manager.addItemToList(magazine);

        assertEquals(1,manager.itemList.size());
        assertTrue(manager.itemList.contains(magazine));
    }
    
}
