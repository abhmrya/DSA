package DSAExercise.Binary;

public class UpperBound {
    static int upperBoundelement(int[] arr,int key){
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {2,5,7,15,15,15,22,25,58};
        int key=2;
        int result=upperBoundelement(arr, key);
        System.out.println(result);
    }
}