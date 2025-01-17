package LeetCode;

import java.util.Arrays;

/*Input: [2, 3, 5, 1, 6]
        Expected Output: [2, 5, 10, 11, 17]*/

public class RunningSumInArray {
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4};
        int [] res= new int[arr.length];
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum=sum +arr[i];
            res[i] = sum;
        }
        System.out.println(Arrays.toString(res));
    }
}
