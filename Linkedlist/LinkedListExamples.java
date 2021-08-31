package Linkedlist;

public class LinkedListExamples {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data+"\n");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedListExamples list = new LinkedListExamples();
        list.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node four = new Node(400);
        list.head.next = second;
        second.next = third;
        third.next = four;
        list.display();

    }
}
