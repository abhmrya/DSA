public class arr03_traverse {
    static void traverseArray( int [] arr1,int size){
        // for(int i=size-1;i>=0;i--){
        //     System.out.println(arr1[i] + " ");
              
        // }

        // for(int i:arr1){
        //     System.out.println(i);
        // }

        int i=0;
        while(i<size){
            System.out.println(arr1[i]);
            i++;
        }

    }
    public static void main(String[] args) {
       
        int[] arr = new int[10];
        int size=5;
        arr[0]=10;
        arr[1]=5;
        arr[2]=16;
        arr[3]=19;
        arr[4]=1;

        traverseArray(arr,size);

    }
}
