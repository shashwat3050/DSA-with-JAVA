package May_14;//import java.sql.SQLOutput;

public class variables {
    class hello {
        static int x = 10;
    }
    class hi{
        int y = 20;
    }
    public static void main(String[] harsh){
        System.out.println(hello.x);
        //System.out.println(hi.y); // can't access because non-static variable cannot be accessed outside the block scope

        // final byte a = 3;
        // final byte b = 127;
        //byte c = a+b;
        //System.out.println(c);

        byte b2 = 4;
        int i = 3 + b2;
        int c1 = b2 + i;
        System.out.println(c1);



    }
}
