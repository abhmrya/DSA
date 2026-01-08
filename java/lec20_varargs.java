public class lec20_varargs {
    // static void display(int...num){
    //     System.out.println("Inside varargs methos...");
    // }
    // static void display(String str1,String str2,int...num){
    //     System.out.println("Inside varargs methos...");
    //     System.out.println(str1);
    //     System.out.println(str2);
    //     for(int i :num){
    //         System.out.print(i+" ");
    //     }
    // }


    // static void display(String str,int num[]){
    //     System.out.println("Inside varargs methos...");
    //     for(int i :num){
    //         System.out.print(i+" ");
    //     }
    // }
    static void display(String str,int...num){
        System.out.println("Inside varargs methos...");
        for(int i :num){
            System.out.print(i+" ");
        }
    }

    static void display(String str,int a,int b,int c){
        System.out.println("Inside varargs methos...");
    }
    public static void main(String[] args) {
        // display("Abhay");
        // display("abhay",10);
        // display("abhay",10,-6);
        // display("10",5,4,6,4,2,6,2);
        // display(3.3);
        // int[] arr = {1,2,3,4,5,6};
        // display("Abhay", arr);
        //  display("Abhay","Kush", arr);
        // int[] arr = {1,2,3,4,5,6};
        // display(arr);
        
        // display(new int[] {});
        // display(new int[] {8,9,10,4});
        // System.out.printf("Your name is %s","Abhay\n");
        // System.out.printf("Your name is %10s","Abhay\n");
        // System.out.printf("Your name is %-10s","Abhay");
        // System.out.printf("Your name is %.10f",43.9);

        display("Abhay", 56,34,32);
        display("Abhay", 1,2);
        display("abhay");   // using varargs
    }
}
