package DSAExercise.DoublyLL;

public class Node {
    Node nextNode;
    Node prevNode;
    int data;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
        this.prevNode = null;
    }
}
