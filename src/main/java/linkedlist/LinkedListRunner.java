package linkedlist;

public class LinkedListRunner {
    public static void main(String[] args) {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        //Linking these nodes ..
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        // If nodes linked then print success msg .
        if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode))
            System.out.println("Linking success");
        else
            System.out.println("Linking Failed");
    }
}
