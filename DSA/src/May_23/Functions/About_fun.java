package May_23.Functions;
// anything inside the function is called as the local scope and can be accesed in the function only
// anything inside the if block of any braces is called as the block scope
// block scope has more priority than that of the local scope
// in java fun inside fun can not be declared

public class About_fun {
    int a = 10;    //global variable
    void fun1(){
        int a = 2;     //functional or local scope
        //int b = 5;
        if(a%2 ==0){
            a = 20;      //block scope re-writes the a
        }
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args){
        About_fun obj = new About_fun();
        obj.fun1();
    }
}