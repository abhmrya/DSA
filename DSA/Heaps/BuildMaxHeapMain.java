package DSA.Heaps;

public class BuildMaxHeapMain {
    public static void main(String[] args) {
        BuildMaxHeap heap = new BuildMaxHeap();
        // int[] heapArr = {3,5,9,6,8,20,10,12,18,1};
        // heap.heapArr =new int[] {3,5,9,6,8,20,10,12,18,1};
        // heap.buildMaxHeap(heap.heapArr,heap.heapArr.length);
        // heap.displayHeap();

        int[] heapArr = {3,5,9,6,8,20,10,12,18,9};
        heap.buildMaxHeap(heapArr,heapArr.length);
        heap.displayHeap(heapArr);
    }
}
