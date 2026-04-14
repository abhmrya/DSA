package DSAExercise.Stack;

import java.util.Stack;

public class Next_Greater_Element {
    public int[] nextGreater(int[] nums){
        int arr [] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            // remove smaller element
            while(!stack.isEmpty() && nums[i]>=stack.peek() ){
                stack.pop();   
            }
            // assign answer
            if(stack.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=stack.peek();
            }

            // push current element
            stack.push(nums[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        Next_Greater_Element sol = new Next_Greater_Element();
        int[] ans = sol.nextGreater(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
