// Language: Java

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Criminal <number_of_criminals>");
            System.exit(1);
        }

        int number_of_criminals = Integer.parseInt(args[0]);
        int[] survivors = lastTwoStanding(number_of_criminals);
        System.out.println(survivors[0] + ", " + survivors[1]);
    }

    public static int[] lastTwoStanding(int n) {
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 2) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        int[] survivors = new int[2];
        survivors[0] = circle.get(0);
        survivors[1] = circle.get(1);
        return survivors;
    }
}
