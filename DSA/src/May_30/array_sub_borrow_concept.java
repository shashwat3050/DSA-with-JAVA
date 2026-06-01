package May_30;

import java.util.Arrays;

public class array_sub_borrow_concept {
    public static void subtractArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int borrow = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            int a = arr1[i] - borrow;
            int b = arr2[i];
            if (a < b) {
                a = a + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = a - b;
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {1,0,7};

        subtractArray(arr1, arr2);

    }
}
