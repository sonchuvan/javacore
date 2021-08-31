package Linkedlist;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    // addNode will add a new node to the list
    public void addNode(int data){
        Node newNode = new Node(data);
        //check if the list is empty
        if (head ==null){
            //if list is empty, both head and tail will point to the new node
            head = newNode;
            tail = newNode;
        }
        else{
            //new node will be added after tail such that tail's next will point to newnode
            tail.next = newNode;
            tail = newNode;    
        }
    }
    public void display(){
        // node current will point to head
        Node current = head;
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        System.out.print("Nodes of single linkedlist:\n");
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.display();   
    }

}
