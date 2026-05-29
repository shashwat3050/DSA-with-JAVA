package May_28;

import java.util.Scanner;

public class count_ele_lessThan_x {
    static void count(int nums[], int x){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < x) count++;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        count(arr, k);
    }
}
