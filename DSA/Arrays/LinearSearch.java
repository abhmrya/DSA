import  java.util.Arrays;

public class LinearSearch {
    static int FindElement(int[] arr,int element){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==element){
                if(i>0){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    return i-1;
                }
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {23,43,56,76,45,93,65,43};
        int element =76;

        int result = FindElement(arr,element);
        System.out.println("Modify element is : "+Arrays.toString(arr));
        if (result==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("Element index is : "+result);
        }
    }
}
