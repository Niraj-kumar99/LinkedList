package linkedlist;

public class LinkedListRunner {

    /*
     create Linked List by adding 30 and 56 to 70
     Node with value 70 is First Created
     Next 30 is added to 70
     Finally 56 is added to 30
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
    }
}
