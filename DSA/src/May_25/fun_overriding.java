package May_25;

//import static May_25.A.add;

class A{
    public int add(int a, int b){
        return a+b;
    }
}
class B extends A{
    @Override
    public int add(int a, int b){
        return a*b;
    }
}
public class fun_overriding {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.add(3, 5));
        System.out.println(obj2.add(3, 5));
    }
}
