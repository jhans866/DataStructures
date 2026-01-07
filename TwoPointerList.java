import java.util.ArrayList;

public class TwoPointerList {
    static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        int start=0, end = numbers.size()-1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        //i<j && i < numbers.size()-1 &&j>=0
        while (start<end && end>=0 && start<numbers.size()-1)
        {
            if (numbers.get(start)+numbers.get(end)==target)
            {
                System.out.println("start:" + start);
                System.out.println("end:" + end);
                result.add(start);
                result.add(end);
                start++;
                end--;
                System.out.println();
                //return result;
            }

            else if (numbers.get(start)+numbers.get(end)> target)
            {
                System.out.println(">start:" + start);
                System.out.println(">end:" + end);
                end--;
            }
            else if (numbers.get(start)+numbers.get(end)< target)
            {
                System.out.println("<start:" + start);
                System.out.println("<end:" + end);
                start++;
            }
            else if (end<start && numbers.get(start)+numbers.get(end)==target)
            {
                System.out.println("start>end start:" + start);
                System.out.println("start>end <end:" + end);
                result.add(-1);
                result.add(-1);

            }

        }
        return result;
    }

    public static void main(String[] args) {

    }
}
