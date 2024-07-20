import java.util.*;

public class ConditionalStatements{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        // If-Else 
        if(Age>=18){
            System.out.println("Adult: Vote");
        }
        else{
            System.out.println("Not allowed to Vote");
        }

        // Else If
        int income = sc.nextInt();
        float tax;
        if(income<500000){
            tax = 0;
        }
        else if(income>=500000 && income<1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is:" + tax);

        // Ternary Operator
        int A = sc.nextInt();
        String type = ((A%2==0)) ? "Even" : "Odd";
        System.out.println(type);

        // Switch Statements
        System.out.println("enter X: ");
        int x = sc.nextInt();
        System.out.println("enter Y: ");
        int y = sc.nextInt();
        System.out.println("enter Operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println(x+y);
                break;
            case '-': System.out.println(x-y);
                break;
            case '*': System.out.println(x*y);
                break;
            case '/': System.out.println(x/y);
                break;
            case '%': System.out.println(x%y);
                break;
            default: System.out.println("Wrong Operator Entered");
                break;
        }
    }
}