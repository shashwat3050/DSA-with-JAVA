package May_28;

import java.util.Arrays;

public class array_rotation {
    static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static void rotate_Left(int[] arr, int x){
        int n = arr.length;
        x %= n;

        reverse(arr, 0, x-1);
        reverse(arr, x, n-1);
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
    static void rotate_Right(int[] arr, int x){
        int n = arr.length;
        x %= n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, x-1);
        reverse(arr, x, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int k = 2;
        int[] nums2 = nums1.clone(); //clone function is used here because, in java arrays are passed by reference so it changes the actual values

        rotate_Left(nums1, k); // here rotate_left already changes the array positioning
        rotate_Right(nums2, k);
    }
}
