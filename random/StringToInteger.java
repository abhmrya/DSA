package random;

public class StringToInteger {
    public void convertInt(String str){
        int num =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int n = (int) ch-'0';
            System.out.println(" before num : "+num);
            num = 10*num+n;
            System.out.println("After num : "+num);
        }
        System.out.println("num : "+num);
    }


    public static void main(String[] args) {
        String str = "123";
        int num = 123;
        StringToInteger obj = new StringToInteger();
        // obj.convertInt(str);
        // String s = num+"";
        // System.out.println(s);
        int n = 100;
        String s = n + "";
        System.out.println(s);
    }
    
}
