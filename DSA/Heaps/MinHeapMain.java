package DSA.Heaps;

public class MinHeapMain {
    public static void main(String[] args) throws Exception{
        // MinHeap minHeap = new MinHeap(10);
        MinHeap minHeap = new MinHeap();
        minHeap.insertMin(10);
        minHeap.insertMin(8);
        minHeap.insertMin(12);
        minHeap.insertMin(33);
        minHeap.insertMin(1);
        minHeap.insertMin(3);
        minHeap.displayHeap();
    }
}
