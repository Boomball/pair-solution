package boomball.solution;

public class Solution3 {

    public static String solution3(String input) {
        int number = Integer.parseInt(input);
        if (number < 0 || number > 10_000) {
            throw new IllegalArgumentException("error");
        }

        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += clap(i);
        }

        return String.valueOf(result);
    }

    private static int clap(int number) {
        int claps = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;

            if (digit != 0 && digit % 3 == 0) {
                claps++;
            }
        }
        return claps;
    }
}
