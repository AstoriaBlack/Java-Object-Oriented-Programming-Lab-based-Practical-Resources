package librarycentre_package;

public class LibraryCentre_MockLabBasedPractical {
    public static void main (String[] args) {
        WestminsterLibraryManager manager = new WestminsterLibraryManager(5);

        boolean exit = false;

        while(!exit) {
            exit = manager.runMenu();
        }

    }
}
