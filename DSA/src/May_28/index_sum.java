package May_28;

import java.util.Arrays;

public class index_sum {
    static void sum(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length];
        for(int i=0; i< arr1.length; i++){
            res[i] = arr1[i]+arr2[i];
        }
//        for(int j: res){
//            System.out.print(j+" ");
//        }
        System.out.println(Arrays.toString(res)); //to directly print the array in a string formate
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {4,5,6,3,3};

        sum(nums1, nums2);
    }
}
