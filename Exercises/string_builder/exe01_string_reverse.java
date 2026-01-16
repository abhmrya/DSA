package string_builder;

public class exe01_string_reverse {
    public static void main(String[] args) {
        String str="abhay";
        
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
