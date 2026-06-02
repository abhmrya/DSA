package DSA.Heaps;

public class MaxHeapMain {
    public static void main(String[] args) {
        MaxHeap heap= new MaxHeap(10);
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.insert(60);
        heap.insert(23);
        heap.insert(12);
        heap.displayHeap();
    }
}
