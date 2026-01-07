import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.sum;

public class StrreamDemos {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,6,7};
        double[] arr1 = {9};
        double sum= Arrays.stream(arr).sum();
        System.out.println(sum);
        double sum1= Arrays.stream(arr1).sum();
        System.out.println(sum1);
        double median = (sum+sum1)/(arr.length+arr1.length);
        System.out.println(median);
        /*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        long list4 = list.stream()
                .mapToLong(Integer :: intValue)
                .sum()
                ;
        System.out.println(list4);
        long listSize = list.size();

        List<Integer> list1 = Arrays.asList(8);
        long list5 = list.stream()
                .mapToLong(Integer :: intValue)
                .sum();

        long list1Size = list1.size();*/
     //System.out.println(list4+list5)/(list1Size+listSize));

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        l1.addAll(l2);
        List <Integer> ll1 = l1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ll1);
    }
}
