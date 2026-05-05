package DSAExercise.Recursion;

public class Pow {
    public double myPow(double x, int n) {
        double N = n;
        double result = helper(x, Math.abs(N));
        if (n > 0) {
            return result;
        } else {
            return 1 / result;
        }
    }

    public double helper(double x, double N) {
        if (N == 0)
            return 1;
        if (x == 0)
            return 0;
        if (N % 2 == 0) {
            return helper(x * x, N / 2);
        } else {
            return x * helper(x * x, (N - 1) / 2);
        }
    }

    public static void main(String[] args) {
        Pow obj = new Pow();
        double result = obj.myPow(2, 910);
        System.out.println("result : " + result);
    }
}