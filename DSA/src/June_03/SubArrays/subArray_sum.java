package June_03.SubArrays;

public class subArray_sum {
    static void sum(int[] arr) {
        int n = arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            min = Math.min(min, arr[i]);
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum > max) max = sum;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("max: "+ max +", min: "+ min);
    }

    public static void main(String[] args) {
        int[] nums = {1,-2,6,-1,3};
        sum(nums);
    }
}


