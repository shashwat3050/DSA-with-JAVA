package May_15;

import java.util.*;

public class calci_with_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("Operator: ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '/':
                if(b==0){
                    System.out.println("Division by zero is not possible");
                } else{
                    System.out.println(a/b);
                }
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '%':
                if(b==0){
                    System.out.println("Modulo by zero is not possible");
                } else{
                    System.out.println(a%b);
                }
                break;
        }
    }
}
