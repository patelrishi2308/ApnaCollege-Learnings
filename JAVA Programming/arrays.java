import java.util.*;

public class arrays{
    public static void subarrays(int numbers[]){
        for (int i=0; i<numbers.length; i++){
            int start= i;
            for (int j=i; j<numbers.length; j++){
                int end= j;
                for (int k=start; k<=end; k++) {
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void bruteforce(int numbers[]){
        int max_sum=0;
        for (int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    sum = numbers[k] + sum;
                    }
                    if(max_sum<sum){
                        max_sum=sum;
                }    
            }
        }
        System.out.print( "Maximum sub-array sum is " + max_sum);
    }

    public static void main(String args[]){
        /* int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("maths :" + marks[2]); */

        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        subarrays(numbers);
        // Maximum Subarrays  -> Time Complexities
        bruteforce(numbers); // O(n^3)        

    }
}