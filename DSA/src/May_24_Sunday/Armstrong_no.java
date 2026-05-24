package May_24_Sunday;

public class Armstrong_no {
    private static void isArmstrong(int n){
        boolean strong = false;
        int sum =0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            sum += (int) Math.pow(rem, 3);
            n/=10;
        }

        if(sum == temp){
            strong = true;
            System.out.println(strong);
        } else{
            System.out.println(strong);
        }
    }
    public static void main(String[] args){
        isArmstrong(-1);
    }
}
