package May_22;// requirement is double gap

public class hollow_tri {
    public static void main(String[] args){
        for(int i=0; i<5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int k=0; k<5; k++){
            for(int l=0; l<=2*k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
