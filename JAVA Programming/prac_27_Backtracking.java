public class prac_27_Backtracking {

    // Function to print the array
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // TC: O(n)
    public static void changeArr(int[] arr, int i, int val) {
        // Base case: If we have reached the end of the array
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // Recursive case: Modify the current element and move to the next element
        arr[i] = val;
        // Recursive call step
        changeArr(arr, i + 1, val + 1);
        // Backtracking step: Undo the change to restore the original state
        arr[i] = arr[i] - 2;
    }


    // TC: O(n*2^n) SC: O(n)
    public static void findSubsets(String str, int i, String ans) {
        // Base case: If we have reached the end of the string
        if (i == str.length()) {
            // If ans is empty, print "null" otherwise print ans
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursive case 2: Include the current character in the answer and move to the next character
        findSubsets(str, i + 1, ans + str.charAt(i));
        // Recursive case 1: Exclude the current character and move to the next character
        findSubsets(str, i + 1, ans);
    }


    public static void findPermutation(String stri, String ans) {
        // Base case: If the input string is empty
        if (stri.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursive case: Iterate through the string
        for (int i = 0; i < stri.length(); i++) {
            // Take the current character
            char curr = stri.charAt(i);
            // Form the remaining string by excluding the current character
            String remaining = stri.substring(0, i) + stri.substring(i + 1);
            // Recursive call with the remaining string and the current character appended to the answer
            findPermutation(remaining, ans + curr);
        }
    }


    // TC: O(n!)
    public static void nQueens(char[][] board, int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place the queen
                nQueens(board, row + 1); // Recursive call
                board[row][j] = '.'; // Backtracking step
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char[][] board) {
        System.out.println("-------- Chess Board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // TC: O(2^m+n)
    public static int gridWays(int i, int j, int n, int m) {
        // Base case
        if (i == n - 1 && j == m - 1) { // Condition for last cell
            return 1;
        } else if (i == n || j == m) { // If out of bounds
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m); // Move down
        int w2 = gridWays(i, j + 1, n, m); // Move right
        return w1 + w2;
    }


    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case
        if (row == 9 && col == 0) {
            return true;
        }
        // Recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // Solution exists
                    return true;
                }
                sudoku[row][col] = 0; // Backtracking step
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Column check
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Row check
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {


        int[] arr = new int[5]; // Create an array of size 5
        changeArr(arr, 0, 1);   // Start modifying the array from index 0 with initial value 1
        printArr(arr);          // Print the array to see the final state after backtracking


        String str = "abc";
        findSubsets(str, 0, "");


        String stri = "abc";
        findPermutation(str, "");


        int n = 4; // You can change the value of n for different board sizes
        char[][] board = new char[n][n];
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);


        int n = 3; // Number of rows
        int m = 3; // Number of columns
        System.out.println(gridWays(0, 0, n, m));


        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }

    }
    
}




public class Classroom {
    public static void main(String[] args) {
        
    }

    
}
