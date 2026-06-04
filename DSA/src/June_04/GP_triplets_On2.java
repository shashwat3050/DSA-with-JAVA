package June_04;

public class GP_triplets_On2 {
    static void gp(int[] arr){
        int count=0;
        int n = arr.length;
        for(int i=1; i<n-1; i++){
            int p1= i-1;
            int p2= i+1;
            int curr = arr[i];

            while(curr%arr[p1] !=0 && p1>0){
                p1--;
            }

            while(arr[p2]%curr !=0 && p2<n){
                p2++;
            }

            if(curr/arr[p1] == arr[p2]/curr){
                count++;
                System.out.println(arr[p1]+" "+curr+" "+arr[p2]);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        gp(nums);
    }
}
