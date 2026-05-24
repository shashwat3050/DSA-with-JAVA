package May_22;// requirement is double gap

public class hollow_tri {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            //System.out.println(); //not required because it will shift the star to next line
            for(int k=0; k<=i; k++){
                if(k==i || k==0 || i==5-1){
                    System.out.print("* ");
                } else{
                    System.out.print("  "); //double space required to get the proper structure of triangle
                }
            }
            System.out.println();
        }
    }
}
