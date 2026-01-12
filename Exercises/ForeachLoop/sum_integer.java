package ForeachLoop;

// print sum of all element of an integer array using for each loop
public class sum_integer {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,9,2,7,89,4,0};
        int sum =0;
        for(int i:numbers){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
