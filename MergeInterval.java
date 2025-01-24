import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> intervals) {
        // If intervals are empty, return an empty list
        if (intervals == null || intervals.size() == 0) {
            return new ArrayList<>();
        }

        // Sort intervals based on the starting value of each interval
        intervals.sort((a, b) -> a.get(0) - b.get(0));

        // Initialize the result list to store merged intervals
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Add the first interval to the result
        result.add(intervals.get(0));

        // Iterate through the intervals
        for (int i = 1; i < intervals.size(); i++) {
            ArrayList<Integer> current = intervals.get(i);
            ArrayList<Integer> lastMerged = result.get(result.size() - 1);

            // Check if current interval overlaps with the last merged interval
            if (current.get(0) <= lastMerged.get(1)) {
                // Merge intervals by updating the end of the last merged interval
                lastMerged.set(1, Math.max(lastMerged.get(1), current.get(1)));
            } else {
                // No overlap, just add the current interval to the result
                result.add(current);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MergeInterval solution = new MergeInterval();

        // Example 1
        ArrayList<ArrayList<Integer>> intervals1 = new ArrayList<>();
        intervals1.add(new ArrayList<>(Arrays.asList(2, 3)));
        intervals1.add(new ArrayList<>(Arrays.asList(2, 6)));
        intervals1.add(new ArrayList<>(Arrays.asList(8, 10)));
        intervals1.add(new ArrayList<>(Arrays.asList(15, 18)));

        System.out.println(solution.merge(intervals1));  // Output: [[1, 6], [8, 10], [15, 18]]

        // Example 2
        ArrayList<ArrayList<Integer>> intervals2 = new ArrayList<>();
        intervals2.add(new ArrayList<>(Arrays.asList(3, 4)));
        intervals2.add(new ArrayList<>(Arrays.asList(4, 5)));

        System.out.println(solution.merge(intervals2));  // Output: [[1, 5]]
    }
}
