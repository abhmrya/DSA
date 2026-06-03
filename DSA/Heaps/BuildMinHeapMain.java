package DSA.Heaps;

public class BuildMinHeapMain {
    public static void main(String[] args) {
        BuildMinHeap heap = new BuildMinHeap();
        // int[] heapArr = {3,5,9,6,8,20,10,12,18,1};
        heap.heapArr =new int[] {3,5,9,6,8,20,10,12,18,1};
        heap.buildMinHeap(heap.heapArr,heap.heapArr.length);
        heap.displayHeap();
    }
}
