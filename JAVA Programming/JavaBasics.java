import java.util.*;

public class JavaBasics {
    public static void main (String args[]) {
        System.out.print("Hello World!\n");
        int a =10;
        int b =5;
        String x = "Rishi";
        //Outpt in JAVA
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        // code to calculate SUM
        int sum = a+b;
        System.out.println(sum);
        // Input in JAVA
        Scanner sc = new Scanner(System.in); // Object for SCAN
        int number = sc.nextInt();
        System.out.println(number);
        // Code to Sum from user Input
        int c = sc.nextInt();
        float d = sc.nextFloat();
        float summ = c+d;
        System.out.println(summ);
        float product = c*d; 
        System.out.println(product); // Find product of A and B
        float r = sc.nextFloat();
        double area = 3.14*r*r; // or can write "float area = 3.14f * r * r;""
        System.out.println(area); // Find Area of circle
        // Type Conversion (Destination type > Source type)
        int con1 = sc.nextInt();
        float con2 = con1;
        System.out.println(con2);
        // Type Casting (Destination type < Source type)
        float con3 = sc.nextFloat();
        int con4 = (int)con3;
        System.out.println(con4);
    }
}