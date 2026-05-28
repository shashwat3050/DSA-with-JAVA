package May_27.Arrays;

import java.util.Scanner;

public class linear_search {
    static int search(int[] nums, int k){
        int get=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                get = i;
                break;
            }
        }
        return get;
    }
    static boolean ele(int[] nums, int k){
        boolean get=false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                get = true;
                break;
            }
        }
        return get;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        System.out.println(search(arr, a));
        System.out.println(ele(arr, a));
    }
}
