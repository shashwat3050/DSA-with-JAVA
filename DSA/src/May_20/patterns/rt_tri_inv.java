package May_20.patterns;

public class rt_tri_inv {
    public static void main(String[] args){
        int n = 5;
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
