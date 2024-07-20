import java.util.*;

public class PatternsAdvance{
    public static void hollow_rectangle(int r, int c){
        for (int i=1; i<=r; i++){
            for (int j=1; j<=c; j++){
                if(i==1 || i == r || j ==1 || j == c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void half_mirror_pyramid(int row){
        int j;
        int k;
        for(int i=1; i<=row; i++){
            j = row - i;
            for( ; j>0; j--){
                System.out.print(" ");
            }
            for (k=i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        hollow_rectangle(4,8);
        half_mirror_pyramid(4);
    }
}