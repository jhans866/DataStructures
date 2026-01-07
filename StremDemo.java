import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremDemo {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("jha");
        ls.add("Jhansi");
        ls.add("Ram");
        ls.add("Shrihan");
        ls.add("Rihu");
        ls.add("san");
        long count =  ls.stream().filter(str->str.length()==3).count();
       // System.out.println(count);

        Integer [] arr = {2,3,4,5,6,7,8,9};
        List<Integer> numberList = Arrays.asList(arr);
        //numberList.stream().filter(i-> i%2==0).foreach(System.out::print);
        numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);

        List<Integer> numberList2 = numberList.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
        System.out.println(numberList2);
       // List<Integer> numberList3 = numberList.stream().sorted(compare).collect(Collectors.toList());
    }
}
