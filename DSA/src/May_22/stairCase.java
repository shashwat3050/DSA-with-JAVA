package May_22;

public class stairCase {
    public static void main(String[] args){
//        for(int i=0; i<5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print("* * ");    //-------this logic is wrong because it is printing a normal increasing triangle
//                if(i%2==0){
//                    System.out.print("");
//                }
//            }
//            System.out.println();
//        }
        int n = 1;
        for(int i=0; i<6; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i%2==0){    //for every row which is divisible by 2, two extra stars will be printed in them
                n = n+2;
            }
        }
    }
}
