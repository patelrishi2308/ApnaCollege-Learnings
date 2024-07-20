import java.util.*;
public class prac_7{
    public static void main(String args[]){
        /*Question1:In a program,input 3 numbers:A,BandC.
        You have to output the average of these 3 numbers */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        float D = A+B+C;
        System.out.println(D/3);

        /*Question2:In a program,input the side of a square.
        You have to output the area of the square. */
        float s = sc.nextFloat();
        System.out.println(s*s);

        /*Question3:Enter cost of 3 items from the user(using float datatype)-
        a pencil, a pen and an eraser. You have to output 
        the total cost of the items back to the user as their bill. */
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        float gst = bill*18 / 100;
        System.out.println(bill + gst);

        // ANS 4: Double

        // ANS 5: No
    }
}