package May_19;

public class perfect_sq {
    public static void main(String[] args){
        int count=0;
        int a=1;
        while(a*a<=100) {
            if (a * a > 10) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
