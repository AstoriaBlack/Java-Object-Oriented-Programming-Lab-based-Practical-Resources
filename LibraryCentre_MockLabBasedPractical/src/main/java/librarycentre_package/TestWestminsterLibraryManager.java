package librarycentre_package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestWestminsterLibraryManager {
    @Test
    public void testAddItemsToList() {
        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);

        Book book = new Book("Harry Potter","7482865");
        manager.addItemToList(book);

        assertEquals(1,manager.itemList.size());
        assertTrue(manager.itemList.contains(book));
    }
}
