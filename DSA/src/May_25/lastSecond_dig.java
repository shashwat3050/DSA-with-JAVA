package May_25;

public class lastSecond_dig {
    static boolean check(int a){
        boolean itIs = false;
        int count =0;
        while(a>0){
            int rem = a%10;
            count++;
            if(count == 2 && rem%2==0){
                itIs = true;
                break;
                //if(rem%2==0) itIs = true;
            }
            a /= 10;
        }
        return itIs;
    }
    public static void main(String[] args){
        System.out.println(check(12355));
    }
}
