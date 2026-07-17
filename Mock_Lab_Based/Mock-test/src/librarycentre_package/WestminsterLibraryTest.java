package librarycentre_package;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WestminsterLibraryTest {
    @Test
    public void AddItemsToList() {
        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);
        Book book = new Book("Harry Potter","1234567890");

        manager.addItemToList(book);

        assertEquals(1,manager.itemList.size());
        assertTrue(manager.itemList.contains(book));

    }
}
