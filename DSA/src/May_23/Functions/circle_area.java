package May_23.Functions;

public class circle_area {
    static float circleA(float r){
        final float pi= 3.14f;
        return (pi*r*r);
    }
    public static void main(String[] args){
        System.out.println("Area: "+circleA(7));
    }
}
