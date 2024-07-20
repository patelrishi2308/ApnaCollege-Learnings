import java.util.*;

public class prac_12{
    public static void average (int x, int y, int z){
        int average = (x+y+z) / 3;
        System.out.println(average);
    }

    public static boolean isEven (int e){
        if(e%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome (int p){
        int num =0;
        int cop = p;
        int rev = 0;
        while(p>0){
            num = p%10;
            rev = rev*10 + num;
            p = p/10;
        }
        if(cop==rev){
            return(true);
        }
        else{
            return(false);
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 5;
        int z = 6;
        //1
        average(x,y,z);
        //2
        int e = sc.nextInt();
        boolean ans = isEven(e);
        System.out.println(ans);
        //3
        int p = sc.nextInt();
        boolean out = isPalindrome(p);
        System.out.println(out);

    }
    
}