package May_14;

public class ternery {
    public static void main(String[] args){
        int a = 12;
        int b =45;
        String c = a>b ? "greater":"smaller";
        System.out.println(c);

        int e = 34;

        int res = a>b ? a:b;
        int f = res > e? res: e;
        //int d = (a>b && a>e) ? a:(b>a && b>e) ? b: e;

        System.out.println(f);

        int age = 11;
        String ab = age >= 18? "matdaan kree": "nikal lo! bachhe";
        System.out.println(ab);
    }
}
