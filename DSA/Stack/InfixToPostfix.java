package DSA.Stack;

import java.util.Stack;

public class InfixToPostfix {
    static int precedence(char op){
        switch (op) {
            case '^':return  3;
            case '/','*':return 2;
            case '+','-' :return  1;                
        }
        return -1;
    };

    static boolean isRightAssociative(char op){
        return op=='^';
    }

    static String infixToPostfix(String exp){
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch :exp.toCharArray()){
            if(Character.isLetter(ch)){
                output.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while (!stack.isEmpty() && stack.peek()!='(') {
                    output.append(stack.pop());                    
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && stack.peek() !='(' &&
                 (precedence(ch) < precedence(stack.peek()) ||
                  precedence(ch) == precedence(stack.peek()) &&
                   !isRightAssociative(ch)) ){
                    output.append(stack.pop()); 
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());  
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String expression = "a+b*c+d-(a*b)";
        String postfix = infixToPostfix(expression);
        System.out.println("Postfix : "+postfix);
    }
}
