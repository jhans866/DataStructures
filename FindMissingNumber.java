public class FindMissingNumber {

    public static boolean isMissingNumberArray(int[] arr)
    {
        System.out.println("inside method");
        int size = arr.length-1;
        System.out.println("size "+size);
        System.out.println("arr[size] "+arr[size]);
        if (arr[size]==size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        boolean result= false;
        result = isMissingNumberArray(arr);
        System.out.println("result "+result);
    }


}
