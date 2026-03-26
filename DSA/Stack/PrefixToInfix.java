package DSA.Stack;
import java.util.Stack;

public class PrefixToInfix {
    static String prefixToInfix(String exp){
        Stack<String> stack = new Stack<>();
        for(int i =exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                String st = "("+s1+ch+s2+")";
                stack.push(st);
            }
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        String expression = "-+a*bc-/de+fg";
        String infix = prefixToInfix(expression);
        System.out.println("infix : "+infix);
    }
}