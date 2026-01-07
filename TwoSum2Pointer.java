public class TwoSum2Pointer {
    //return true if the sum of 2 elements is matching to a target value
    public static void main(String[] args) {
        int [] arr = {2,5,7,11,15,18};
        int target = 20;
        int left = 0, right=arr.length-1;
        while (left<right && left<arr.length &&right>0)
        {
            System.out.println("arr[left] : " +arr[left]+"arr[right]: " +arr[right]);
            if (arr[left]+arr[right]==target)
            {
                System.out.println("Yes");
                right--;
                left++;
            }
            if (arr[left]+arr[right]>target)
                right--;
            if (arr[left]+arr[right]<target)
                left++;
        }

    }
}
