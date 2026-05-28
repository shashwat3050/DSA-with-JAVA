package May_26;

public class decimal_to_hexadecimal {
    static String deciToHexa_string(int n){
        if(n==0) return "0";
        //int rem =0;
        StringBuilder sb = new StringBuilder("");
        while(n>0){
            int rem =n%16;
            if(rem<10){ //agar rem ki value 10 se chhoti hai to direct uski value ko append(add) kr denge string me
                sb.append(rem);
            }else{
                sb.append((char)('A'+ rem-10)); //here jo bhi rem ki value 10 ya 10 se upar jayegi usko rem se sub kr ke char 'A' me plus krege jisse a-f ki value mil jayegi
            }
            n /= 16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(deciToHexa_string(255));
    }
}
