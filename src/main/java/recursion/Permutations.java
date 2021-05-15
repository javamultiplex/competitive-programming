package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rohit Agarwal on 10/04/21 10:49 pm
 * @copyright www.javamultiplex.com
 */
public class Permutations {

    public static void permutationsWithDistinctCharacters(String string, String permutation) {
        int length = string.length();
        if (length == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            String restOfString = string.substring(0, i) + string.substring(i + 1);
            permutationsWithDistinctCharacters(restOfString, permutation + ch);
        }

    }


    public static void permutationsWithDistinctCharactersV2(String string, int j) {
        int length = string.length();
        if (j == length - 1) {
            System.out.println(string);
            return;
        }

        for (int i = j; i < length; i++) {
            string = swap(string, i, j);
            permutationsWithDistinctCharactersV2(string, j + 1);
            string = swap(string, i, j);
        }

    }

    private static String swap(String string, int i, int j) {
        char[] chars = string.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static void permutationsWithDuplicateCharacters(String string, String permutation) {
        int length = string.length();
        if (length == 0) {
            System.out.println(permutation);
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if (!set.contains(ch)) {
                String restOfString = string.substring(0, i) + string.substring(i + 1);
                set.add(ch);
                permutationsWithDuplicateCharacters(restOfString, permutation + ch);
            }
        }

    }

    public static void main(String[] args) {
        permutationsWithDistinctCharacters("ABC", "");
        permutationsWithDistinctCharactersV2("ABC",0);
        permutationsWithDuplicateCharacters("AAC", "");
    }
}
