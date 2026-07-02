package LinkedLists;

// Node<T> is a generic class — T is a placeholder for any type.
// Each Node holds one piece of data and a reference to the next Node.
public class Node<T extends Comparable<T>> {

    //The actual data stored in this node
    private T data;

    //Reference to the next node in the chain
    //null means "there is no next node - means it's the last node"
    private Node<T> next;

    //Constructor: creates a node with data, next starts as null
    public Node(T data) {
        this.data = data;
        this.next = null; //by default, a new node points to nothing
    }

    //Getters and Setters
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    //compareTo: compare this nodes data to another node's data
    //returns 0 if they are equal
    //returns <0 if this nodes data comes before the other
    //returns >0 if this node's data comes after the other
    //This works because T extends Comparable<T> - meaning whatever
    //type T is (String, Integer, etc.) must have a compareTo method
    public int compareTo(Node<T> other) {
        return this.data.compareTo(other.data);
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }


}
