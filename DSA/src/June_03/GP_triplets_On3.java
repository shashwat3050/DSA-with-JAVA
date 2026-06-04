package June_03;

public class GP_triplets_On3 {
    static void gp(int[] arr){
        int n = arr.length;
        int count=0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[j]/arr[i] == arr[k]/arr[j] && arr[j]%arr[i] == arr[k]%arr[j]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        gp(nums);
    }
}
