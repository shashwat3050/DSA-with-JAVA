package May_26;

public class binary_to_decimal {
    static int BinToDeci_int(int n){
        int res =0;
        int power =0;
        while(n>0){
            res += (n%10)* (int)Math.pow(2, power);
            power++;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(BinToDeci_int(11));
    }
}
