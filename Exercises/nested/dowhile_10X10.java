package nested;

public class dowhile_10X10 {
    public static void main(String[] args) {
        int i=1;
        do {
            int j=1;
            do {
                System.out.print(i*j+" ");
                j++; 
            } while (j<=10);
            System.out.println();
            i++; 
        } while (i<=10);
    }

}
