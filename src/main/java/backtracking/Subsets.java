package backtracking;

import java.util.LinkedList;

/**
 * @author Rohit Agarwal on 08/05/21 5:08 pm
 * @copyright www.javamultiplex.com
 */
public class Subsets {
    public static void subsets(int[] arr, int index, int n, LinkedList<Integer> list) {
        if (index == n) {
            System.out.println(list);
            return;
        }
        list.addLast(arr[index]);
        subsets(arr, index + 1, n, list);
        list.removeLast();
        subsets(arr, index + 1, n, list);
    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3}, 0, 3, new LinkedList<>());
    }
}
