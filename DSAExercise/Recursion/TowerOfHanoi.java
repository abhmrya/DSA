package DSAExercise.Recursion;

public class TowerOfHanoi {
    static void towerOfHanoi(int n,char s,char h,char d){
        if(n==0) return ;
        towerOfHanoi(n-1, s, d, h);
        System.out.println("Move from "+s+" to "+d);
        towerOfHanoi(n-1, h, s, d);
    }
    public static void main(String[] args) {
        int n=20;
        towerOfHanoi(n,'S','H','D');
    }
}
