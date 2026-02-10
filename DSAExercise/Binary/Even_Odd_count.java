package DSAExercise.Binary;


// public class Even_Odd_count {
//     public int odd;
//     public int even;
//     void evenodd(int[] arr){ 
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]%2==0){
//                 even++;
//             }else{
//                 odd++;
//             }
//         }
//     }
//     public void Display(){
//         System.out.println("Odd numbers is : "+odd);
//         System.out.println("even numbers is : "+even);
//     }
    
//     public static void main(String[] args) {

//         Even_Odd_count obj = new Even_Odd_count();

//         int[] arr = new int[] {1,3,4,5,6,7,8,9,76,56,7,34,66,77,88,99,6,65,3};
//         obj.evenodd(arr);
//         obj.Display();
//     }
// }


public class Even_Odd_count {
    static int[] evenodd(int[] arr){ 
    int odd = 0;
    int even = 0;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0){
            even++;
        } else {
            odd++;
        }
    }
    return new int[]{odd, even};
}  
    public static void main(String[] args) {
    int[] arr = {1,3,4,5,6,7,8,9,76,56,7,34,66,77,88,99,6,65,3};
    int[] result = evenodd(arr);
    System.out.println("Odd numbers are : " + result[0]);
    System.out.println("Even numbers are : " + result[1]);
}
}