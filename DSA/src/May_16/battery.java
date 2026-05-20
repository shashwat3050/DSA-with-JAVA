package May_16;

public class battery {
    public static void main(String[] args){
        int b = 10;
        int min = 0;
        while(b<100){
            min++;
            b+=10;
        }
        System.out.println(min);
    }
}
