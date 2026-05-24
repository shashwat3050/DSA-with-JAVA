package May_24_Sunday;

import java.util.Scanner;

public class no_frequency {
    static void checkFreq(int num, int fq){
        int count=0;
        while(num>0){
            int rem = num%10;
            if(rem == fq) count++;
            num /= 10;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();

        System.out.print("Frequency of: ");
        int x = sc.nextInt();

        checkFreq(n, x);

    }
}
