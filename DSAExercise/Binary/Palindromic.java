package DSAExercise.Binary;

public class Palindromic {
    static boolean  checkpalindrome(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 2, 1};
        boolean result = checkpalindrome(arr);
        if(result==true){
            System.out.println("yes this is palindrome.");
        }else{
            System.out.println("No : this is not palindrome.");
        }
    }
}
