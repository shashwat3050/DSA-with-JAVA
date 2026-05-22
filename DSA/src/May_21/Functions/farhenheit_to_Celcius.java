package May_21.Functions;

public class farhenheit_to_Celcius {
    static double convert(float f){
        return ((f-32)*5/9);
    }
    public static void main(String[] args){
        System.out.println("Temp in Celcius: "+convert(98));
    }
}
