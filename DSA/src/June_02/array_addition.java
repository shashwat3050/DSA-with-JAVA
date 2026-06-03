package June_02;

import java.util.Arrays;

public class array_addition {
    static void sum(int arr1[], int arr2[], int n, int m) {
        // Result array size can be max(n,m) + 1
        int[] res = new int[Math.max(n, m) +1];

        int arr1_len = n -1;
        int arr2_len = m -1;
        int res_len = res.length -1;
        int carry =0;

        while(arr1_len >=0 || arr2_len >=0 || carry >0) { //adding digits from the back one at a time from both the arrays and
            int sum = carry;                              //checking if the carry was generated
            if(arr1_len >=0) {
                sum = sum + arr1[arr1_len];
                arr1_len--;
            }
            if(arr2_len >=0) {
                sum = sum + arr2[arr2_len];
                arr2_len--;
            }
            res[res_len] = sum%10;
            carry = sum/10;
            res_len--;
        }

        //remove trailing 0
        // Remove leading zero if not needed
        int len = res.length;
        if(res[0] == 0) {
            int[] ans = new int[len - 1];

            for(int x = 1; x < len; x++) {
                ans[x - 1] = res[x];
            }
            System.out.println(Arrays.toString(ans));
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] nums1 = {4,4,4};
        int[] nums2 = {5,5,6};
        int n = 3 , m = 3;

        sum(nums1, nums2, n, m);
    }
}
