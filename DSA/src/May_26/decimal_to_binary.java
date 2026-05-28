package May_26;

public class decimal_to_binary {

    //-----------decimal to binary conversion using string-builder-----------

    static String deciToBin_string(int n){
        int rem = 0;
        if(n==0){
            return "0";
        }
        StringBuilder st = new StringBuilder("");
        while(n>0){
            st.append(n%2);
            n/=2;
        }
        return st.reverse().toString();
    }

    //-----------decimal to binary conversion using integer----------

    static int DeciToBin_int(int n){
        int newN = 0;
        int val =1;
        while(n>0){
            int rem =n%2;
            newN = newN + rem*val;
            val *= 10;
            n/=2;
        }
        return newN;
    }

    public static void main(String[] args){
        //System.out.println(DeciToBin_string(10));
        System.out.println(DeciToBin_int(10));
    }
}
