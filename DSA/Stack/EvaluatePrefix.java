package DSA.Stack;
import java.util.Stack;
public class EvaluatePrefix {
    static boolean isOperater(char op){
        return op=='+' || op=='-' || op=='*' || op=='^';
    }

    static int compute(char op,int op1,int op2){
        switch (op) {
            case '+':return op1+op2;
            case '-':return op1-op2;
            case '*':return op1*op2;
            case '/':return op1/op2;
            case '^':return (int)Math.pow(op1, op2);
            default:
                throw new AssertionError("Invalid Oprator : "+op);
        }
    }

    static int evaluatePrefix(String exp){
        Stack<Integer> stack = new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else if(isOperater(ch)){
                int op1 = stack.pop();
                int op2 = stack.pop();
                int updatedOp = compute(ch,op1,op2);
                stack.push(updatedOp);
            }
            else{
                throw new IllegalArgumentException("Invalid character : "+ ch);
            }
       }
        return stack.pop();
    }


    public static void main(String[] args) {
        String prefix = "+1*23";
        int output = evaluatePrefix(prefix);
        System.out.println("Output : "+output);

    }
}
