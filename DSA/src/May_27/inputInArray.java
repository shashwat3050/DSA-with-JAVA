package May_27;

import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
//            System.out.print(i+" ");  //for all the elements in the array
            if(i%2==0){
                System.out.print(i+" "); //for all the even elements in the array
            }
        }

    }
}
