package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        Node node = ll.reveseLinkedList(ll.head);
        ll.print(node);
    }

}




class LinkedList{

    Node head = null;
    Node add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return node;
        }

        Node currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;

        }

        currentNode.next = node;
        return node;

    }

    void print(Node node){
        while (node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
    // 1 -> 2 -> 3
    Node reveseLinkedList(Node head){
        Node newnode = null;
        while(head!= null){
            Node temp = head;
            head = head.next;
            temp.next = newnode;
            newnode = temp;
        }
        return newnode;
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

