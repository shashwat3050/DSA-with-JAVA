package May_20;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        //Palindrome as well as rev number logical code -

//        int rev = 0;
//        while(n!=0){
//            int rem = n%10;
//            rev = rev*10 + rem;
//            n/=10;
//        }
//       System.out.println(rev);


//        if(rev == temp){
//            System.out.println("It is Palindrome");
//        } else{
//            System.out.println("It is not Palindrome");
//        }



        // Armstrong Number code -

        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum += (int) Math.pow(rem, 3);
            n/=10;
        }

        if(sum == temp){
            System.out.println("An armstrong Number");
        } else{
            System.out.println("not an armstrong number");
        }
    }
}
