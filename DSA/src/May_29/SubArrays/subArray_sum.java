package May_29.SubArrays;

public class subArray_sum {
    static void sum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        sum(nums);
    }
}


