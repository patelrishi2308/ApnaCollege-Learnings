import java.util.*;

public class functions_and_methods{
    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }
    public static int calculateProduct(int num1, int num2) { // parameters or formal parameters
        int product= num1*num2;
        return product;
    }
    public static int calculateFactorial(int num) {
        int fac = 1;
        for(;num>0;num--){
            fac = fac*num;
        }
        return fac;
    }
    public static void main (String args[]){
        printHelloWorld(); // function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b); // arguments or actual parameters
        System.out.println("Product is: " + product);
        int n = 4;
        int fac = calculateFactorial(n);
        System.out.println("Factorial of "+ n+ " is :" + fac);
    }
}