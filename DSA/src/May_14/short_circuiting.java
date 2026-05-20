package May_14;

public class short_circuiting {
    public static void main(String[] harsh) {
        int x = 10;

        if (x > 5 || x++ > 100) {
            System.out.println(x+" True");
        } else {
            System.out.println(x+" False");
            System.out.println(x);
            if (x > 5 | x++ > 100) {
                System.out.println(x+" True");
            } else {
                System.out.println(x+" False");
            }

        }
    }
}