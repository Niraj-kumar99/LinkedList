package linkedlist;

public class LinkedListRunner {

    /*
     inserting 30 between 56 and 70
     So the final Linked List Sequence will be : 56->30->70
     */
    public static void main(String[] args) {

        LinkedListOperation linked_list = new LinkedListOperation();

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //Inserting 30 in-between 56 and 70.
        linked_list.appendNode(myFirstNode);
        linked_list.appendNode(myThirdNode);
        linked_list.insertInMiddle(myFirstNode,mySecondNode);

        //Displaying the nodes.
        linked_list.displayNode();

        // Removing First element From Linked List
        linked_list.deleteFirstNode();
        linked_list.displayNode();
    }
}
