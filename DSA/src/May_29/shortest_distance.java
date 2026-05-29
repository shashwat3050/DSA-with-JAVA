package May_29;

public class shortest_distance {
    static void distance(int[] nums){
//        int e1 =0, e2=0;
//        int len=0;
//        for(int i=0; i<nums.length; i++){
//            e1 = e2;
//            if(nums[i]%2==0) e2=i;
//            len = e2 -e1;
//        }
//
//        System.out.println(len);
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j] %2==0) {
                        if (ans == -1) {
                            ans = j - 1;
                        }
                        ans = Math.min(ans, j - i);
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        distance(arr);
    }
}
