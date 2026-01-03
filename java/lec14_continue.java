public class lec14_continue {
    public static void main(String[] args) {
        // for(int i =0;i<=10;i++){
        //     if(i==5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for(int i = 1;i<=10;i++){
        //     System.out.println("Outer loop iteration :" +i);
        //     for(int j=1;j<=5;j++){
        //         if(i==3){
        //             System.out.println("Skipping innner loop iterration when j is :"+ j);
        //             continue;
        //         }
        //         System.out.println("Inner loop itertion :"+ j);
        //     }
        // }

        Outerloop:for(int i = 1;i<=3;i++){
            System.out.println("Outer loop iteration :" +i);
            for(int j=1;j<=3;j++){
                if(j==2){
                    System.out.println("Skipping outer loop iterration when j is :"+ j);
                    continue Outerloop;
                }
                System.out.println("Inner loop itertion :"+ j);
            }
        }
            
    }
}
