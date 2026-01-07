import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int size = arr1.length;
        int[] arr2 = new int[size];
        int sum = 0;
        for (int i =0; i<arr1.length;i++)
        {
            sum = sum + arr1[i];
            arr2[i]=sum;
        }
        Arrays.stream(arr2).forEach(i-> System.out.println(i));
    }
}
