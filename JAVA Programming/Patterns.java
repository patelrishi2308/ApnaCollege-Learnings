import java.util.*;

public class Patterns{
    public static void main (String args[]){
        int i;
        int y;
        for(i=1;i<=4;i++){
            for(y=1;y<=i;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("1-------------------------------------------------------");
        int j;
        int z;
        for(j=4;j>0;j--){
            for(z=j;z>0;z--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2-------------------------------------------------------");
        int r;
        int s;
        for(r=1;r<=4;r++){
            for(s=1;s<=r;s++){
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println("3-------------------------------------------------------");
        int p;
        int q;
        char c='A';
        for(p=1;p<=4;p++){
            for(q=1;q<=p;q++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}