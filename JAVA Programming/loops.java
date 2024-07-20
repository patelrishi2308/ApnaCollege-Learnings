import java.util.*;

public class loops{
    public static void main (String args[]){

        // WHILE LOOP
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N:");
        int n= sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter<=n){
            sum = sum + counter;
            counter ++;
        }
        System.out.println("Sum of first N natural numbers is: "+sum);

        // FOR LOOP
        int digit=0;
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(;num > 0;){
            digit = num % 10;
            num = num / 10;
            System.out.print(digit);
        }

        // DO WHILE LOOP
        do {
            System.out.println("Enter the Number: ");
            int i=sc.nextInt();
            if(i%10==0){
                break;
            }
            System.out.println(i);
        } while(true);

        
    }
}