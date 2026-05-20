package May_21;

public class rev_and_str_tri {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 5; k > 0; k--){
            for(int j=k; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
