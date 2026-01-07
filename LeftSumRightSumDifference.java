import java.util.Arrays;

public class LeftSumRightSumDifference {
    public int[] findDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] differenceArray = new int[n];
        int leftSum = 0, rightSum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        System.out.println("rightSum full: "+rightSum);

        // Calculate the difference between left and right sums for each position
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            System.out.println("rightSum: "+rightSum);
            differenceArray[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
            System.out.println("leftSum: "+leftSum);
        }

        return differenceArray;
    }
    public static void main(String[] args) {
        LeftSumRightSumDifference solution = new LeftSumRightSumDifference();
        int[] example1 = {2, 5, 1, 6, 1};
        int[] example2 = {3, 3, 3};
        int[] example3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution.findDifferenceArray(example1))); // Output: [13, 6, 0, 7, 14]
        System.out.println(Arrays.toString(solution.findDifferenceArray(example2))); // Output: [6, 0, 6]
        System.out.println(Arrays.toString(solution.findDifferenceArray(example3))); // O

    }
}
