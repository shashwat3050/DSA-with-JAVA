package May_29;

public class max_distance {
    static void length(int[] arr){
        int len=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    len=Math.max(len, j-i);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,6,3,3};
        length(nums);
    }
}
