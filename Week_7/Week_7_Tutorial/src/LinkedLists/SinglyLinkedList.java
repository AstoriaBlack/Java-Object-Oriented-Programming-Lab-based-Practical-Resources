//SinglyLinkedlist<T> a generic linked list
//T extends Comparable<T> so we can use compareTo() inside Node
public class SinglyLinkedList<T extends Comparable<T>> {

    //The only thing linked list needs to store, a reference to the first node
    //if head == null, the list is empty
    private Node<T> head;

    //Constructor: empty list, head points to nothing
    public SinglyLinkedList() {
        this.head = null;
    }

    //add(T newElement)
    //adds a new element at the end of the list

    //Before: head -> [A] -> [B] -> null
    //add(C)
    //After: head -> [A] -> [B] -> [C] -> null

    public void add (T newElement) {
        Node<T> newNode = new Node<>(newElement); //created the new node
        //e.g. if newElement == A, we create [A] ->
        if (head == null) {
            //List is empty - new node becomes the head
            head = newNode;
        } else {
            //Walk to the last node (the one whose next == null)
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext(); //move one step forward
            }
            //current is now the last node - so attach the new node after it
            current.setNext(newNode);
        }
        System.out.println("Added: "  + newElement);
    }

    // addAfter(T newElement, T after)
    // Inserts a new element IMMEDIATELY AFTER the node containing 'after'.
    //
    // Before: head -> [A] -> [B] -> [C] -> null
    // addAfter(X, B)
    // After: head -> [A] -> [B] -> [X] -> [C] -> null

    public void addaAfter(T newElement, T after) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node<T> current = head;

        //walk through the list looking for the node that contains 'after'
        while (current != null) {
            if (current.getData().compareTo(after) == 0) {
                //found the target node - insert new node right after it

                Node<T> newNode = new Node<>(newElement);

                //step 1: new node's next points to whatever was after current
                newNode.setNext(current.getNext());

                //step 2: current's next now points to the new node
                current.setNext(newNode);

                System.out.println("Added " + newElement + " after " + after);
                return;
            }
            current = current.getNext(); //move forward
        }

        //if we get here, 'after' was never found in the list
        System.out.println("Element '" + after + "' not found. Nothing added.");
    }
    // deleteFront()
    // Removes the FIRST node (the head).
    //
    // Before: head → [A] → [B] → [C] → null
    // deleteFront()
    // After:  head → [B] → [C] → null
    public void deleteFront() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        System.out.println("Deleted front: " + head.getData());

        //simply move head forward to the second node
        //the old head node is now unreferenced = Java's garbage collector cleans it up
        head = head.getNext();
    }

    // deleteAfter(T after)
    // Removes the node that comes IMMEDIATELY AFTER the node containing 'after'.

    //Before: head -> [A] -> [B] -> [C] -> [D] -> null
    //deleteAfter(B)
    //After: head -> [A] -> [B] -> [D] -> null (C is removed)

    public void deleteAfter(T after) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            if (current.getData().compareTo(after) == 0) {
                //found the target node
                if(current.getNext() == null) {
                    //there is no node after this one - nothing to delete
                    System.out.println("No node after'" + after +"' to delete");
                    return;
                }

                //The node to remove is current.getNext()
                Node<T> toRemove = current.getNext();

                //Skip over toRemove by pointing current directly to toRemove's next
                current.setNext(toRemove.getNext());

                System.out.println("Deleted node after '" + after + "': " + toRemove.getData());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Element '" + after + "' not found. Nothing deleted.");
    }

    //traverse()
    //Walks through every node from head to tail and prints each one
    public void traverse() {
        if(head == null) {
            System.out.println("List: [ empty ]");
            return;
        }

        System.out.println("List (head -> tail): ");
        Node<T> current = head;

        while (current != null) {
            System.out.print(current);//calls Node's toString() -> [data]
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();//move to next node
        }
        System.out.println(" -> null");//show the list ends here
    }

}
