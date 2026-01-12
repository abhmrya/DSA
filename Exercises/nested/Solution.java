package nested;
class Solution {
    public static void main(String[] args) {
        int numBottles =9;
        int numExchange=3;
        int sum=numBottles;
        while(numBottles>=numExchange){
            System.out.println("numBottles"+numBottles);
            int a = numBottles/numExchange;
            int b = numBottles%numExchange;
            numBottles=a+b;
            sum=sum+a;
        }
        System.out.println(sum);
        
    }
}