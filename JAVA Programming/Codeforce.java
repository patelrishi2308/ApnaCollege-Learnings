import java.util.Scanner;

public class Codeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] a = new int[n];
            
            // Reading the array elements
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Find the two largest distinct elements
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            
            for (int num : a) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2 && num < max1) {
                    max2 = num;
                }
            }
            
            // If max2 remains Integer.MIN_VALUE, it means there's no second largest distinct element
            int result = (max2 == Integer.MIN_VALUE) ? 0 : max2;
            
            System.out.println(result);
        }
        
        sc.close();
    }
}
