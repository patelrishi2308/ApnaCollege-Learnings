import java.util.*;

public class prac_28_ArrayList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  //Initialized ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse print
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // Find Maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = " + max);


        //Swap
        int idx1 = 1, idx2 = 3;
        System.out.println("Before swap: " + list);
        swap(list, idx1, idx2);
        System.out.println("After swap: " + list);
    }
}