package random;

import java.util.ArrayList;

public class PrimeNumber {
    public void primenumber(int n){
        boolean[] prime = new boolean[n];
        if(n<2) return ;
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]==false){
                count++;
                // prime[i]=true;
                for(int j=2;i*j<n;j++){
                    prime[i*j]=true;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =2;i<n;i++){
            if(prime[i]==false){
                list.add(i);
            }
        }
        for(int i: list){
            System.out.print(i+" ");
        }
    }

    
    // ArrayList<Integer> list = new ArrayList<>();
    // public void primenumber(int n){
    //     for(int i=2;i<n;i++){
    //         boolean prime = true;
    //         for(int j=2;j<i;j++){
    //             if(i%j==0){
    //                 prime=false;
    //                 break;
    //             }
    //         }
    //         if(prime){
    //             list.add(i);
    //         }
    //     }
    //     for(int i: list){
    //         System.out.print(i+" ");
    //     }
    // }
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.primenumber(1000000);
        
    }
}
