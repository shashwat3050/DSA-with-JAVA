package May_23.Functions;

public class prime {
    public static void checkPrime(int a){
        boolean isPrime = a != 1;
        for(int i=2; i*i<=a; i++){
            if(a %i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
    public static void main(String[] args){
        //prime o = new prime();
        checkPrime(7);

    }
}
