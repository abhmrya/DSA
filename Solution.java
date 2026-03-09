class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = (char) s.charAt(i);
            if (ch > 64 && ch < 92) {
                String st = String.valueOf((char) (ch + 32));
                System.out.println(
                    st
                );
                sb.append(st);
            } else {
                System.out.println(ch);
                sb.append(ch);
            }
        }
        String a = sb.toString();
        return a;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.toLowerCase("Hello"));
    }
}