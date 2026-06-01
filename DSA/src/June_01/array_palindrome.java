package June_01;

public class array_palindrome {
    static void isPalindrome(int[] arr){
        int p1=0;
        int p2 = arr.length-1;
        boolean check = true;
        int count=0;
        while(p1<p2){
            if(!(arr[p1] == arr[p2])){
                check = false;
                break;
            }
            p1++;
            p2--;
        }
        System.out.println(check);
    }
    public static void main() {
        int[] nums = {1,2,1};
        isPalindrome(nums);
    }
}
