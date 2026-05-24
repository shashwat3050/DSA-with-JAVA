package May_18;

public class prime_using_while {
    public static boolean isPrime(long x){
        boolean found = true;
        if(x<2){
            found = false;
        }
        long i=2;
        while(i*i<x){
            if(x%i==0){
                found = false;
                break;
            }
            i++;
        }
        return found;
    }
    public static void main(String[] args){
        System.out.println(isPrime(999999937L));
    }
}
