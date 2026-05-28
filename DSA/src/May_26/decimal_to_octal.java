package May_26;

public class decimal_to_octal {
    static String deciToOctal_string(int n){
        if(n==0) return "0";
//        int rem =0;
        StringBuilder sb = new StringBuilder("");
        while(n>0){
            sb.append(n%8);
            n /= 8;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(deciToOctal_string(10));
    }
}
