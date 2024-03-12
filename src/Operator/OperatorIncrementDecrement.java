package Operator;

public class OperatorIncrementDecrement {
    public static void main(String[] args) {
        //Variabel 
        int a = 1;
        int b = 10;
        int c = 0;
        //Operator Increment
        System.out.println("Operator Increment");
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        
        //Operator Decrement
        System.out.println("Operator Decrement");
        System.out.println(b--);
        System.out.println(b--);
        System.out.println(b--);
        System.out.println(b--);
        System.out.println(b--);
        
        //operator Increment dan Decrement
        System.out.println("Operator Increment dan Decrement");
        System.out.println("c = a + b =" + (a+b));
    }
    
}
