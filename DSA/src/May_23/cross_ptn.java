package May_23;

public class cross_ptn {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j || j+i==5-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
