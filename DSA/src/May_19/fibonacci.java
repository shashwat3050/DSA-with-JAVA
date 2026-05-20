package May_19;

import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        while (n > 0) {
            return fib(n - 1) + fib(n - 2);
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0; i<=x; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
