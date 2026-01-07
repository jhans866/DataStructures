import java.util.ArrayList;

public class InsertionSort {

    static ArrayList<Integer> insertion_sort(ArrayList<Integer> arr) {

        int temp = 0, index = 0;
        for(int i =0; i<arr.size();i++)
        {
            temp = arr.get(i);
            index = index -1;
            //while(index>0 && index)
        }

        return arr;
    }
    public static void main(String args[]) {
        InsertionSort ob = new InsertionSort();
        int arr[] = { 94, 8, 73, 32, 11 };
        //ob.insertion_sort(arr);
        System.out.println("Sorted array");
       // ob.printArray(arr);
    }
}
