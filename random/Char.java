package random;

// longes palidrom 
public class Char {
    static void longestPalindrome(String s) {
        int[] res = new int[58];

        for(int i : res){
            System.out.print(i+" ");
        }
        System.out.println();

        char[] ch = s.toCharArray();

        for (char c : ch) {
            System.out.print(c+" ");
            res[c - 'A']++;
        }
        System.out.println();
                for(int i : res){
            System.out.print(i+" ");
        }
        System.out.println();
        int count=0;
        boolean oddstore=false;
        for(int i : res){
            if(i%2==0){
                count+=i;
            }
            if(i%2==1){
                oddstore=true;
            }
        }
        System.out.println(count);
        System.out.println(oddstore);
        if(oddstore==true){
            count+=1;
        }
        System.out.println("longes palidrome id :"+count);
    }

    public static void main(String[] args) {

        // longestPalindrome("aAbhayZz");
        
        longestPalindrome("abccABAccdd");
    }
}
