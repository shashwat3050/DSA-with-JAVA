package May_21;

public class rhombus {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for(int k=5; k>=0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
