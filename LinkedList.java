package JAVA;

public class LinkedList{

    Node head = null;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.print();
    }
    void add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;

        }

        currentNode.next = node;

    }

    void print(){
        while (head != null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}