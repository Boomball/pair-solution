package boomball.solution;

public class Solution2 {

    public static String solution2(String input) {
        if (!input.matches("^[a-z]+$") || input.isEmpty() || input.length() > 400) {
            throw new IllegalArgumentException("error");
        }

        StringBuilder sb = new StringBuilder(input);

        while (compress(sb)) ;
        return sb.toString();
    }

    private static boolean compress(StringBuilder sb) {
        int before = sb.length();
        int prev = 0;

        for (int i = 1; i < sb.length(); i++) {
            while (sb.length() > i && sb.charAt(i) == sb.charAt(prev)) {
                i++;
            }
            if (prev != i - 1) {
                sb.delete(prev, i);
            }
            prev = i;
        }
        return sb.length() != before;
    }
}
