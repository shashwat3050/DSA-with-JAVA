package May_25;

public class add_even {
    static void add_e(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++){
            if(i%2==0) sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        add_e(3, 5);
    }
}
