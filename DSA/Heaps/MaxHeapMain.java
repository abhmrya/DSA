package DSA.Heaps;

public class MaxHeapMain {
    public static void main(String[] args) {

        // Array 

        // MaxHeap heap= new MaxHeap(10);

        // list Array
        MaxHeap heap = new MaxHeap();
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.insert(60);
        heap.insert(23);
        heap.insert(12);
        heap.displayHeap();
        heap.delete();
        System.out.println();
        heap.displayHeap();
    }
}
