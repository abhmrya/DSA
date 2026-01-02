public class lec13_jumpstatment {
    public static void main(String[] args) {
        // for(int i =1;i<=10;i++){
            // if(i==5){
            //     break;
            // }
            // System.out.println(i);
            // }   

            // int a =5;
            // if(a==5){
            //     System.out.println(a);
            //     break;
            // }

            // int a =5;
            // LabelIF:if(a==5){
            //     System.out.println(a);
            //     break LabelIF;
            // }

            // for(int i=0;i<3;i++){
            //     for(int j=0;j<3;j++){
            //         if(i==1 && j==1){
            //             System.out.println("breaking inner loop...");
            //             break;
            //         }
            //         System.out.println("i: "+ i + "j: "+j);

            //     }
            // }

            outerLoop:for(int i=0;i<3;i++){
                innerLoop:for(int j=0;j<3;j++){
                    if(i==1 && j==1){
                        System.out.println("breaking both loop...");
                        break outerLoop;
                    }
                    System.out.println("i: "+ i + "j: "+j);

                }
            }
    }
}
