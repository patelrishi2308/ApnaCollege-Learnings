import java.util.*;

public class prac_10{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        
        // 1 ->3
        
        //2 

        //3
        System.out.println("Enter the number to find its FACTORIAL: ");
        int n = sc.nextInt();
        int x=1;
        for(;n>0;n--){
            x=n*x;
        }
        System.out.println(x);

        //4
        System.out.println("Enter the number to get its Multiplication table: ");
        int num = sc.nextInt();
        int tab=0;
        int y;
        for(y=1;y<11;y++){
            tab=num*y;
            System.out.println(num + "*" + y + "=" + tab);
        }

        //5
        

    }
}