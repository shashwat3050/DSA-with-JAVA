package June_02;

public class swap_num {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+", "+ b);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        swap(a,b);
    }
}
