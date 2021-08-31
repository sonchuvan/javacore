package Linkedlist;

public class DeleteFromEnd {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        DeleteFromEnd delete = new DeleteFromEnd();
        delete.addNode(1);
        delete.addNode(2);
        delete.addNode(3);
        delete.addNode(4);
        System.out.println("Original list");
        delete.display();
        while(delete.head!=null){
            delete.deleteEnd();
            System.out.println("Update list");
            delete.display();
        }
    }
}
