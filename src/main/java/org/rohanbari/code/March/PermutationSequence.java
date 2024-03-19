package org.rohanbari.code.March;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. Permutation Sequence
 */
class PermutationSequence {

    /**
     * Creates n permutations, finds the kth sequence.
     * 
     * @param n Total permutations
     * @param k To find
     * @return kth element in nth permutation
     */
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(String.valueOf(i));
        }

        return permutation(sb.toString(), k).get(k - 1);
    }

    public static List<String> permutation(String input, int n) {
        List<String> result = new ArrayList<>();
        String output = "";

        permute(input, output, result, n);
        return result;
    }

    public static void permute(String in, String out, List<String> list, int n) {
        if (in.length() == 0) {
            list.add(out);
            return;
        }

        if (list.size() >= n) {
            return;
        }

        for (int i = 0; i < in.length(); i++) {
            permute(in.substring(0, i) + in.substring(i + 1),
                    out + in.charAt(i), list, n);
        }
    }
}
