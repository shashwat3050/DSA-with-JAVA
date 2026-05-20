package May_16;

import java.util.Scanner;

public class sum_squareD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        while(a!=0){
            int rem = a%10;
            sum += rem*rem;
            a/=10;
        }
        System.out.println(sum);
    }
}
