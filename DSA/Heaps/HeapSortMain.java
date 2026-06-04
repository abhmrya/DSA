package DSA.Heaps;

public class HeapSortMain {
    public static void main(String[] args) {
        HeapSort heap = new HeapSort();
        int[] heapArr = {3,5,9,6,8,20,10,12,18,9};
        heap.heapSort(heapArr,heapArr.length);
        heap.displayHeap(heapArr);

    }
}
