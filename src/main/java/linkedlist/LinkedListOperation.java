package linkedlist;

public class LinkedListOperation {

    public MyNode head = null;
    public MyNode tail = null;


    public MyNode addNode(MyNode newNode) {
        if (tail == null)
            tail = newNode;
        if (head == null)
            head = newNode;
        else {
            INode temp = head;
            head = newNode;
            head.setNext(temp);
        }
        return (MyNode) head;
    }

    //Method to append a element.
    public MyNode appendNode(MyNode newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return (MyNode) head;
    }


    // Method to insert a element in-between two element.
    public void insertInMiddle(MyNode myNode, MyNode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /* Method to delete first node in Linked List */
    public void deleteFirstNode() {
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            head = (MyNode) head.getNext();
    }

    /*Method to display Linked List*/
    public void displayNode() {
        INode current = head;
        System.out.print("Nodes are: ");
        while (current != null) {
            if (current.getNext() != null) {
                System.out.print(current.getKey() + " -> ");
                current = current.getNext();
            } else {
                System.out.println(current.getKey());
                current = current.getNext();
            }
        }
    }
}
