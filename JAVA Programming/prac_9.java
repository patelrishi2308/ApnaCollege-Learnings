import java.util.*;

public class prac_9{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // 1
        System.out.println("Enter the Number: ");
        int x = sc.nextInt();
        if (x>=0){
            System.out.println("Entered number is POSITIVE");
        }
        else{
            System.out.println("Entered number is NEGATIVE");
        }

        //2
        double temp = 103.5;
        if (temp>100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("you don't have fever");
        }

        //3
        System.out.println("Enter any Number between 1 & 7: ");
        int days = sc.nextInt();
        switch (days) {
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default: System.out.println("Wrong Number entered");
                break;
        }

        //4 - False, 63

        //5
        System.out.println("Enter the YEAR ");
        int year = sc.nextInt();
        if(year%4==0 && (year%100!=0 || (year%100==0 && year%400==0)) ){
                    System.out.println("Leap Year");
        }
        else{
                    System.out.println("Not a Leap Year");
                }
    }
}