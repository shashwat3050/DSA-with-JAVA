package May_18.Loops;

import java.util.*;

public class forL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for(int i=1; i<=20; i++){
//            if(i%3==0){
//                System.out.println(i);
//            }
//            System.out.println("3 x "+i+" = "+ i*3);

        //Square root of a number
        long n = sc.nextInt();
        long a = 0;
        for (long i = 0; i*i<=n; i++) {
            if (a == i) {
                a=i;
                break;
            }
        }
        System.out.println((int)a);
    }
}
