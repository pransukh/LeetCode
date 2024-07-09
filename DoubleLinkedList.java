package JAVA;

public class DoubleLinkedList{

    Node_ head = null;
    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print_();
    }
    void add(int data){

        if(head == null){
            Node_ newNode = new Node_(null,data,null);
            head = newNode;
            return;
        }
        Node_ currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        Node_ newNode = new Node_(currentNode,data,null);
        currentNode.next = newNode;
        return;

    }

    void print_(){
        while (head != null){
            System.out.println("----------------------------------------------------------");
            System.out.println(head.previous+"--"+head.data+"--"+head.next);

            head = head.next;
        }
    }


}

class Node_{
    Node_ previous;
    int data;
    Node_ next;

    Node_(Node_ previous, int data, Node_ next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }


}