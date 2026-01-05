package DSA.Time_and_Space;



public class timespace {
    static void linearsearch(){
        int x = 5;
        long starttime,elapsedtime;
        int[] arr =  new int[] {10,7,-4,28,50};  // (10,7),(10,-4),(10,20),(10,50),(7,10)
        // int [] arr= new int[500303090];
        // Arrays.fill(arr,10);
        starttime = System.nanoTime();
        for (int i=0;i<arr.length;i++){   // O(n)
            if(arr[i]==x){
                System.out.println("Element found");
            }
        }
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        elapsedtime = System.nanoTime()-starttime;
        System.out.println("Elapsed Time :"+ elapsedtime/1000+"milisecound");
    }
    public static void main(String[] args) {
        linearsearch();   //O(n+100)
    }
}
