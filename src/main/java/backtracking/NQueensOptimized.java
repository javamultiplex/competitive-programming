package backtracking;

import java.util.BitSet;

/**
 * @author Rohit Agarwal on 09/05/21 10:47 pm
 * @copyright www.javamultiplex.com
 */
public class NQueensOptimized {

    private static int COUNT = 0;
    private static final BitSet columns = new BitSet(100);
    private static final BitSet leftDiagonal = new BitSet(100);
    private static final BitSet rightDiagonal = new BitSet(100);

    public static void countNQueens(int currentRow, int n) {
        if (currentRow == n) {
            COUNT++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!columns.get(col)
                    && !rightDiagonal.get(currentRow + col)
                    && !leftDiagonal.get(currentRow - col + n - 1)) {
                columns.set(col, true);
                rightDiagonal.set(currentRow + col, true);
                leftDiagonal.set(currentRow - col + n - 1, true);
                countNQueens(currentRow + 1, n);
                columns.set(col, false);
                rightDiagonal.set(currentRow + col, false);
                leftDiagonal.set(currentRow - col + n - 1, false);
            }
        }

    }

    public static void main(String[] args) {
        countNQueens(0, 6);
        System.out.println(COUNT);
    }
}
