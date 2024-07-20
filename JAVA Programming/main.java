import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Read the number of test cases
            System.out.print("Enter number of test cases: ");
            int t = Integer.parseInt(reader.readLine().trim());

            for (int i = 0; i < t; i++) {
                // Read the number of elements in the array
                System.out.print("Enter number of elements in array for test case " + (i + 1) + ": ");
                int n = Integer.parseInt(reader.readLine().trim());

                // Read the array elements
                int[] array = new int[n];
                System.out.print("Enter the elements of the array: ");
                StringTokenizer st = new StringTokenizer(reader.readLine().trim());
                for (int j = 0; j < n; j++) {
                    array[j] = Integer.parseInt(st.nextToken());
                }

                // Find the minimum element in the array
                int minValue = Integer.MAX_VALUE;
                for (int value : array) {
                    if (value < minValue) {
                        minValue = value;
                    }
                }

                // Compute the result as minimum value - 1
                int result = minValue - 1;

                // Output the result
                System.out.println("Result for test case " + (i + 1) + ": " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
