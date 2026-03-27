package DSAExercise.Binary;

public class XOR {
    public static void main(String[] args) {
        String a ="abcfee";
        String b = "abc";
        char result = 0;
        char v ='g';

        for (char c : a.toCharArray()) {
            v ^= c;
        }

        for (char c : b.toCharArray()) {
            result ^= c;
        }
        System.out.println("result : "+result);
        }
}
