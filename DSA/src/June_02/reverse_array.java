package June_02;

import java.util.Arrays;

public class reverse_array {
//    static void reverse(int[] arr){
//       int i=0;
//       int j=arr.length-1;
//       while(i<j){
//           swap(arr[i], arr[j]);
//           i++;                           //this code won't work because Java uses pass-by-value, meaning the swap
//           j--;                             method only modifies variable copy, not the actual array elements
//       }
//       for(int k=0; k<arr.length; k++){
//           System.out.print(arr[k]+" ");
//       }
//    }
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(i, j,arr);
            i++;
            j--;
        }
//        for(int k=0; k<arr.length; k++){
//            System.out.print(arr[k]+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
    }
}
