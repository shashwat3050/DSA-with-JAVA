package May_27;

import java.util.Scanner;

public class linear_search {
    static int return_Index(int[] nums, int k){
        int get=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                get = i;
                break;
            }
        }
        return get;
    }
    static boolean isPresent(int[] nums, int k){
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
        System.out.println(return_Index(arr, a));
        System.out.println(isPresent(arr, a));
    }
}
