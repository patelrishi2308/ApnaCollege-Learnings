import java.util.*;

public class Operators{
    public static void main (String args[]) {
        int A = 10;
        int B = 5;
        // Arithmetic Operators (binary)
        System.out.println("Addition =" + (A+B));
        System.out.println("Subtraction =" + (A-B));
        System.out.println("Multiplication =" + (A*B));
        System.out.println("Division =" + (A/B));
        System.out.println("Modulo =" + (A%B));
        // Arithmetic Operators (unary)
        int a = 10;
        int b = a++; // post increament
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = ++c; // pre increament
        System.out.println(c);
        System.out.println(d);
        // Relational Operators 
        System.out.println(A==B);
        System.out.println(A!=B);
        System.out.println(A<B);
        System.out.println(A<=B);
        System.out.println(A>B);
        System.out.println(A>=B);
    }
}