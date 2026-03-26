package DSA.Stack;
import  java.util.Stack;

public class PostfixToInfix {
    static String postfixToInfix(String exp){
        Stack <String> stack = new Stack<>();
        for(char ch  :exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
            String operand = stack.pop();
            String operand2 = stack.pop();
            String updatedOperand = "("+operand2+ch+operand+")";
            stack.push(updatedOperand);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "ab+ef/+";
        String infix = postfixToInfix(postfix);
        System.out.println("Infix" + infix);
    }
}
