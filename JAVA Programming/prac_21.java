import java.util.*;

public class prac_21{
    public static void main(String[] args) {

        //Answer 1: What is the value of x^x for any value of x? 0

        // Answer 2: Swap two numbers without using any thirdvariable.
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        // swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);

        // Answer 3: Add 1 to an integer using Bit Manipulation
        // -x = ~x + 1;
        // -~x = x + 1 (by replacing x by ~x)
        int z = 6;
        System.out.println(z + " + " + 1 + " is " + (-~z));
        z = -4;
        System.out.println(z + " + " + 1 + " is " + (-~z));
        z = 0;
        System.out.println(z + " + " + 1 + " is " + (-~z));

        //Answer 4: Convert uppercase characters to lowercase using bits
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ')); // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}