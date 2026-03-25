package DSA.Stack;

import java.util.Stack;

public class InfixToPrefix {

    static int precedence(char ch){
        switch (ch) {
            case '^' : return 3;
            case '/','*' : return 2;
            case '+','-' : return 1;
        }
        return -1;
    };

    static boolean isRightAssociative(char op){
        return op=='^';
    };

    static String reverseAndSwap(String exp){
        StringBuilder rev = new StringBuilder();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(ch=='('){
                rev.append(')');
            }
            else if(ch==')'){
                rev.append('(');
            }else{
                rev.append(ch);
            }
        }
        return rev.toString();
    }

    public String InfixToPostfix(String exp){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();  // to pop '(' from stack
            }
            else{
                while(!stack.isEmpty() && stack.peek() !='(' &&
                 (precedence(ch) < precedence(stack.peek()) || 
                  (precedence(ch) == precedence(stack.peek()) && !isRightAssociative(ch)))){
                    sb.append(stack.pop()); 
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public String infixToPrefix(String exp){
        String updatedExp = reverseAndSwap(exp);
        String postfix = InfixToPostfix(updatedExp);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        InfixToPrefix obj = new InfixToPrefix();
        // String exp = "a+b*c";
        String exp = "a*b+(a-b*c)";
        String prefix = obj.infixToPrefix(exp);
        System.out.println("prefix : "+prefix);
    }
}
