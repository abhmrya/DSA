package String;

public class StringBuilderdemo {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = 1; i <=10; i++) {
        //     sb=sb.append(i);
        //     System.out.println(sb);
        // }

        // again and again greate new object
        // String str="";  
        // for (int i = 1; i <=10; i++) {
        //     str = str+i;
        //     System.out.println(str);
        // }

        // StringBuilder sb = new StringBuilder("abhay");
        // for (int i = 0; i < 5; i++) {
        //     sb=sb.append(i);  
        // }
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("abhay kush");
        // sb.insert(2, "b").insert(3, "aa");
        // System.out.println(sb);
        // char[] charArray ={'h','e','l','l','o'};
        // sb.insert(3, charArray);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder();
        // // System.out.println(sb.capacity());
        // sb.append("hello");
        // System.out.println(sb.capacity());
        // sb.append("1234567890");
        // System.out.println(sb.capacity());
        // sb.append("123456789012L");
        // System.out.println(sb.capacity());  // new capacity=(old capacity*2)+2

        // StringBuilder sb = new StringBuilder(50);
        // System.out.println(sb.capacity());

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("hello");
        char ch=sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'a');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);

    } 
}
