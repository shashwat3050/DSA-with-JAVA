package May_21;

public class char_pyr {
    public static void main(String[] args){
        for(int i=5; i>0; i--){
            char a = 'A';
            for(int j=0; j<i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();

        }
    }
}
