import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConsecutiveRanges {
    public static void main(String[] args) {
        // Input list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8, 11, 12, 13);

        // Get the formatted output
        String output = formatConsecutiveRanges(numbers);

        // Print the result
        System.out.println(output);
    }

    public static String formatConsecutiveRanges(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int start = numbers.get(0);
        int end = start;

        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);

            if (current == end + 1) {
                // Extend the current range
                end = current;
            } else {
                // Range ended, append it
                appendRange(result, start, end);
                start = current;
                end = start;
            }
        }

        // Append the last range
        appendRange(result, start, end);

        return result.toString();
    }

    private static void appendRange(StringBuilder result, int start, int end) {
        if (start == end) {
            result.append(start).append(",");
        } else {
            result.append(start).append(":").append(end).append(",");
        }
    }
}
