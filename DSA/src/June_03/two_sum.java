package June_03;

import java.util.Arrays;  //two pointer approach will work on the sorted arrays only

public class two_sum {
    static void using_twoPointer(int[] arr, int k){
        Arrays.sort(arr);
        int p1=0;
        int p2 = arr.length-1;

        int[] ans = new int[2];
        while(p1<p2){
            int temp = arr[p1]+arr[p2];
            if(temp == k){
                ans[0] = p1;
                ans[1] = p2;
                break;
            }else if(temp < k){
                p1++;
            }else{
                p2--;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    static void main(String[] args) {
        int[] nums = {3,2,4};
        int x = 6;

        using_twoPointer(nums, x);
    }
}
