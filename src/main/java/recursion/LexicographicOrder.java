package recursion;

/**
 * @author Rohit Agarwal on 09/04/21 12:12 am
 * @copyright www.javamultiplex.com
 */
public class LexicographicOrder {

    public static void lexico(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        for (int j = (i == 0) ? 1 : 0; j <= 9; j++) {
            lexico(n, (10 * i) + j);
        }
    }

    public static void main(String[] args) {
        lexico(115,0);
    }
}
