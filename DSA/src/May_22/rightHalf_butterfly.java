package May_22;

public class rightHalf_butterfly {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j<(6-i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i >0; i--) {
            for (int j = 0; j<(6-i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
