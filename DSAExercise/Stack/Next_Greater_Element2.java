package DSAExercise.Stack;
import java.util.Stack;

public class Next_Greater_Element2 {
    
    public int[] nextGreaterElements(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int arr1[] = new int[arr.length];
        int N=arr.length*2-1;
        int n = arr.length;

        for(int j=n-1;j>=0;j--){
            int i=j%N;
            if(N>n){
                int max=Integer.MIN_VALUE;
                if(arr[i]>max){
                    if(!stack.isEmpty()){
                        stack.pop();
                        stack.push(arr[i]);
                    }else{
                        stack.push(arr[i]);
                    }
                }
            }else{
                while (!stack.isEmpty() && stack.peek()<arr[i]) { 
                    stack.pop();
                }
                if(stack.isEmpty()){
                    arr1[i]=-1;
                }else{
                    arr1[i]=arr[i];
                }
                stack.push(arr[i]);
            }
        }
        
        return arr1;
    }



    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};

        // Create instance of Solution
        Next_Greater_Element2 sol = new Next_Greater_Element2();

        // Call the function
        int[] ans = sol.nextGreaterElements(arr);

        System.out.print("The next greater elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
