public class PairWithTargetSum {
    public static int[]  getNumbersWithSum(int[] array,int sum)
    {
        int left = 0, right =array.length-1;
        while (left<right)
        {
            if(array[left]+array[right]==sum)
            {
                return new int[] {left , right};
            }
            if (array[left]+array[right]>sum)
            {
                right--;
            }
            if (array[left]+array[right]<sum)
            {
                left++;
            }
        }
        return new int[] {left , right};
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int targetSum = 6;
        int[] result = getNumbersWithSum( arr,  targetSum);
        System.out.println(result[0]+ " " + result[1]);
    }
}
