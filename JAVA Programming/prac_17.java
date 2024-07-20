import java.util.*;

public class prac_17{
    public static void main (String args[]){
        int numbers[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(track_repeated(numbers)); // Answer1 (DSA Sheet#4) Brute Force (O(n^2))
        System.out.println(max_profit(numbers)); // Answer3 (DSA Sheet#8)  Buy-Sell Stock
        System.out.println(trapped_rainwater(numbers)); //Answer4 (DSA Sheet#11)
    }


    public static boolean track_repeated(int numbers[]){
        for (int i=0; i<numbers.length - 1; i++){
            for (int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
        
    }



    public static int max_profit(int numbers[]){
        int buyprice = numbers[0];
        int maxprof = 0;

        for(int i=0; i<numbers.length; i++) {
            if(buyprice < numbers[i]) {
                int profit = numbers[i] - buyprice;
                maxprof = Math.max(maxprof, profit);
            }
            else{
                buyprice = numbers[i];
            }
        }
        return maxprof;
    }


    public static int trapped_rainwater(int numbers[]){
        int max_left=0;
        int max_water=0;
        int max_right=0;
        for (int i=1; i<numbers.length; i++){
            if(numbers[i-1]>max_left){
                max_left = numbers[i-1];
            }
            max_right=0;
            for (int j=i+1; j<numbers.length; j++){
                if(numbers[j]>max_right){
                    max_right = numbers[j];
                }
            }
            int height = Math.min(max_left, max_right);
            int water = height - numbers[i];
            if(water < numbers[i]){
                water = 0;
            }
            max_water = water + max_water;
        }
        return max_water; 
    }

}

