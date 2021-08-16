package linkedlist;

public class LinkedListRunner {

    /*
     Making a linkedlist having nodes 56,30,70
     So the Linked List Sequence will be : 56->30->70
     Then Deleting the Last Node .
     */
    public static void main(String[] args) {

        LinkedListOperation linked_list = new LinkedListOperation();

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //Adding nodes .
        linked_list.appendNode(myFirstNode);
        linked_list.appendNode(mySecondNode);
        linked_list.appendNode(myThirdNode);

        //Displaying the nodes.
        linked_list.displayNode();

        // Removing last element from list.
        linked_list.deleteLastNode();
        linked_list.displayNode();

    }
}
