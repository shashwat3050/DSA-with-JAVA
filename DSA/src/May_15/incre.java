package May_15;

public class incre {
    public static void main(String[] args){
        byte z = 127;
        ++z;
        System.out.println(z);
        //byte b1 = b + 3; // here 3 is int and can't be added to byte
        //int b1 =  b+3;
        //System.out.print(b1);

        int a = 6;
        //int b = 9;
        System.out.println(++a + a++ - a++ + a);
    }
}
