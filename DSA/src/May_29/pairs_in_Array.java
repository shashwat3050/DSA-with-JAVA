package May_29;

public class pairs_in_Array {
//    static void allPairs(int[] arr){
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                System.out.print("("+arr[i]+","+arr[j]+")");
//            }
//            System.out.println();
//        }
//    }

    static void divide_by_k(int[] arr, int k){
        int n = arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            int sum = 0;
            sum = arr[i]+arr[i+1];
            if(sum % k ==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,7,5,3};
        int x = 4;
        divide_by_k(nums, x);
    }
}
