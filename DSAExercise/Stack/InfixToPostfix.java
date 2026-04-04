package DSAExercise.Stack;

import java.util.Stack;

public class InfixToPostfix {
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    public int precedence(char ch){
        switch (ch) {
            case '^':return 3;
            case '/','*' :return 2;
            case '+','-':return  1;
        }
        return -1;
    }

    public boolean isRightAssociative(char ch){
        return ch=='^';
    }

    public String infixtopostfix(String st){
        for(char ch : st.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while (!stack.isEmpty() && stack.peek()!='(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && stack.peek() !='(' &&
                (precedence(ch)<precedence(stack.peek()) ||
                !isRightAssociative(ch) && precedence(ch)==precedence(stack.peek()))){
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
    public static void main(String[] args) {
        String infix = "a+b*c-d";
        InfixToPostfix infpos = new InfixToPostfix();
        System.out.println("infix to prefix : "+infpos.infixtopostfix(infix));

    }
}
