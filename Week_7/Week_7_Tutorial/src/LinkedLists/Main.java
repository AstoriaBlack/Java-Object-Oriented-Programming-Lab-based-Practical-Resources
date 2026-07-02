import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ── Demo 1: Linked List of Strings ───────────────────────────────────
        System.out.println("============ String Linked List ============");

        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        //ass() - builds the list from scratch
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.traverse();

        System.out.println();

        //addAfter() - inserts X right after B
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String val = sc.nextLine();
        System.out.println("Enter the after value: ");
        String after = sc.nextLine();

        list.addaAfter(val, after);
        list.traverse();
        System.out.println();

        // addAfter() — try adding after something that doesn't exist
        list.addaAfter("Z", "Q");
        list.traverse();
        System.out.println();

        // deleteFront() — removes A (the head)
        list.deleteFront();
        list.traverse();
        System.out.println();

        //deleteAfter()
        System.out.println("add the value you want to delete after");
        String del = sc.nextLine();
        list.deleteAfter(del);
        list.traverse();
        System.out.println();

        // deleteAfter() — try deleting after the last node (D has no next)
        list.deleteAfter("D");
        list.traverse();
        System.out.println();

        // ── Demo 2: Linked List of Integers ──────────────────────────────────
        System.out.println("============ Integer Linked List ============");

        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.traverse();
        // Expected: [10] → [20] → [30] → [40] → null

        System.out.println();

        intList.addaAfter(99, 20); // insert 99 after 20
        intList.traverse();
        // Expected: [10] → [20] → [99] → [30] → [40] → null

        System.out.println();

        intList.deleteFront(); // removes 10
        intList.traverse();
        // Expected: [20] → [99] → [30] → [40] → null

        System.out.println();

        intList.deleteAfter(99); // removes 30
        intList.traverse();
        // Expected: [20] → [99] → [40] → null

        System.out.println();

        // ── Demo 3: compareTo between two nodes ──────────────────────────────
        System.out.println("============ Node compareTo Demo ============");

        Node<String> node1 = new Node<>("Apple");
        Node<String> node2 = new Node<>("Apple");
        Node<String> node3 = new Node<>("Banana");

        System.out.println("node1 (Apple) vs node2 (Apple): " + node1.compareTo(node2)); // 0
        System.out.println("node1 (Apple) vs node3 (Banana): " + node1.compareTo(node3)); // negative
        System.out.println("node3 (Banana) vs node1 (Apple): " + node3.compareTo(node1)); // positive
    }
    


}
