package May_20;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n2%n1 == 0){
            System.out.println(n1);
        } else{
            while(n2>0){
                int temp = n2;
                n2 %= n1;
                n1 = temp;
            }
            System.out.println(n1);
        }
    }
}
