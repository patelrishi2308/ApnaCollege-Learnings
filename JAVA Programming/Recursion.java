import java.util.*;

public class Recursion{

    // print numbers in Decreasing order
    public static void recursion (int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }

    // print numbers in Increasing order
    public static void irecursion (int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        recursion(n-1);
        System.out.println(n);
    }

    // Factorial of N
    public static int factorial(int n){ // TC:O(n) ; SC:O(n)
        if(n==0){
            return 1;
        }
        int x = factorial(n-1);
        int f = n*x;
        return f;
    }

    // Sum of N
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        int x = sumofn(n-1);
        int sum = n + x;
        return sum;
    }

    // Fibo of N
    public static int fiboof(int n) {   // TC:(2^n) exponential ; SC: O(n) 
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fiboof(n-1);
        int fibnm2 = fiboof(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    // Array is Sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    // First occurence of element in array
    public static int firstOccurence(int arr[], int key, int i){
        if (i== arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // X to the power N
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    // x to the power N OPTIMIZED  O(logn)
    public static int opower(int a, int n) {
        if (n == 0){
            return 1;
        }
        int halfpower = opower (a, n/2);
        int halfpowersq = halfpower * halfpower;
        //n is odd
        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    // Tiling Problem {Amazon}
    public static int tilingProblem(int n) { // 2 X n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        // horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1+fnm2;
        return totWays;
        // return tilingProblem(n-1)+tilingProblem(n-2);
    }

    // Remove Duplicates in a String {Google, Microsoft}
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        //base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    // Friends Pairing Problem {GoldmanSachs}
    public static int friendsPairing(int n) {
        //base
        if(n == 1 || n == 2) {
            return n;
        }
        //kaam
        //choice (single)
        int fnm1 = friendsPairing(n-1);
        //choice (pair)
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)* fnm2;
        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    // Print all binary strings of size N without consecutive ones. {Paytm}
    public static void printBinString(int n, int lastPlace, String str) {
        //base
        if (n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        } 
    }
    

    public static void main (String args[]) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // recursion(n-1);
        // System.out.println(n);
        // System.out.println(factorial(n));
        // System.out.println(sumofn(n));
        // System.out.println(fiboof(n));
        // int arr[]={1,2,3,4,5,4,5};
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOccurence(arr,4 ,0));
        // System.out.println(opower(2,5));
        // System.out.println(tilingProblem(4));
        // String str = "rriiiisshhhiiii";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));

        printBinString(3, 0, "");
        


        
        
        


    }
}