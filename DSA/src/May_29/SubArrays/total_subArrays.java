package May_29.SubArrays;

public class total_subArrays {
    static void all_subArr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
//        for(int i=0; i<n; i++){
//            int[] res = new int[n-i-1];
//            for(int j=i; j<res.length; j++){
//                System.out.println(res[j]);
//            }
//            System.out.println();
//        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        all_subArr(nums);
    }
}
