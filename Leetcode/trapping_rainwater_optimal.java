package Leetcode;
public class trapping_rainwater_optimal {
    public int trap(int[] hieght){
        int totalwater = 0;
        int left=0;
        int right = hieght.length-1;

        int maxleft=0;
        int maxright=0;

        while(left<=right){
            if(hieght[left]<=hieght[right]){
                if(hieght[left]>=maxleft){
                    maxleft=hieght[left];
                }else{
                    totalwater+=maxleft-hieght[left];
                }
                left++;
            }else{
                if(hieght[right]>=maxright){
                    maxleft=hieght[right];
                }else{
                    totalwater+=maxleft-hieght[right];
                }
                right--;
            }
        }
        return totalwater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        trapping_rainwater sol = new trapping_rainwater();
        
        int result = sol.trap(height);
        
        System.out.println("Trapped Rainwater: " + result);
    }
}
