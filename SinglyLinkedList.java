package org.example;

public class SinglyLinkedList<T> {

    private Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    // Node class to store data and reference to the next node
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adds a new element to the end of the list
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Adds a new element to the beginning of the list
    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Removes the first element from the list and returns its data
    public T removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Node<T> temp = head;
        head = head.next;
        return temp.data;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Traverses the list and prints the data of each node
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.append(10);
        list.append(20);
        list.append(30);

        list.printList(); // Output: 10 20 30

        list.prepend(5);
        list.printList(); // Output: 5 10 20 30

        list.removeFirst();
        list.printList(); // Output: 10 20 30
    }

}
