package June_04;

import java.util.Arrays;

public class missing {
    static void number(int[] arr){
        int n = arr.length;
        int sum=0;
        int[] res= new int[1];
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int sum2 = (n*(n+1))/2;
        int missing = sum2 - sum;
        res[0] = missing;

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5};
        number(nums);
    }
}
