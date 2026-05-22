package May_21.Functions;

import java.util.Scanner;

public class greetUser {
    void greeting(String st){
        System.out.println("Hello "+st+"!");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        greetUser obj = new greetUser();
        obj.greeting(str);
    }
}
