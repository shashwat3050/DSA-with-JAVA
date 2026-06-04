package May_29;

import java.util.Arrays;

public class array_substraction {
    static void sub(int[] arr1, int[] arr2){
        int n1=0;
        for (int i: arr1) {
            n1 = (n1 * 10) +i;
            //n1 *= 10;         //this is creating the extra zeroes while the upper statement has already handled it
        }
        int n2=0;
        for(int j: arr2){
            n2 = (n2*10) +j;
            //n2 *= 10;         //same here as before creating extra zeroes
        }
//        int finalN;
//        if(n1>n2) finalN= n1-n2;         //this gives the same output as the other two
//        else finalN= n2-n1;
                //OR
//        int finalN= Math.abs(n1-n2);            //this also gives the same output using the abs inbuilt function
                //OR
        int finalN = n1>n2 ? n1-n2 : n2-n1;       //using ternery operator

        if(finalN==0){
            System.out.print("[0]");
            return;
        }

        int temp = finalN;
        int len=0;
        while(temp>0){
            temp /= 10;
            len++;
        }
        int[] res = new int[len];
        for(int i=len-1; i>=0; i--){

            res[i] = finalN%10;
            finalN /= 10;
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] nums1 = {3,3};
        int[] nums2 = {1,2,3};

        sub(nums1, nums2);
    }
}
